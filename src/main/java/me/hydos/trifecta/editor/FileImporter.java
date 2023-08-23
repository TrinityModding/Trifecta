package me.hydos.trifecta.editor;

import gg.generations.pokeutils.ModelNode;
import gg.generations.rarecandy.arceus.model.lowlevel.DrawMode;
import gg.generations.rarecandy.arceus.model.lowlevel.IndexType;
import gg.generations.rarecandy.arceus.model.lowlevel.RenderData;
import gg.generations.rarecandy.arceus.model.lowlevel.VertexData;
import me.hydos.trifecta.flatbuffers.Titan.Model.*;
import me.hydos.trifecta.trinity.MeshBatch;
import me.hydos.trifecta.type.Model;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import javax.swing.*;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.opengl.GL30C.GL_HALF_FLOAT;

public class FileImporter {

    private static void importModel(Path path, EditorLogic editor) {
        var parentDir = path.getParent();
        var trmdl = TRMDL.getRootAsTRMDL(read(path));
        var trskl = TRSKL.getRootAsTRSKL(read(parentDir.resolve(Objects.requireNonNull(trmdl.skeleton().filename()))));
        var trmtr = TRMTR.getRootAsTRMTR(read(parentDir.resolve(Objects.requireNonNull(trmdl.materials(0)))));
        var trmmt = locateTrmmt(parentDir, Objects.requireNonNull(trmdl.materials(0)));
        var model = new Model();

        // Meshes
        var meshes = new HashMap<TRMSH, TRMBF>();
        for (var i = 0; i < trmdl.meshesLength(); i++) {
            var meshName = Objects.requireNonNull(trmdl.meshes(i).filename(), "Mesh name was null");
            var meshI = TRMSH.getRootAsTRMSH(read(parentDir.resolve(meshName)));
            var meshD = TRMBF.getRootAsTRMBF(read(parentDir.resolve(meshName.replace(".trmsh", ".trmbf"))));
            meshes.put(meshI, meshD);
        }

        for (var entry : meshes.entrySet()) {
            for (int meshIdx = 0; meshIdx < entry.getKey().meshesLength(); meshIdx++) {
                var info = entry.getKey().meshes(meshIdx);
                var data = entry.getValue().buffers(meshIdx);
                var vertexBuffer = data.vertexBuffer(0).bufferAsByteBuffer();
                var idxBuffer = data.indexBuffer(0);

                enum IndexLayout {
                    UINT8(Byte.BYTES),
                    UINT16(Short.BYTES),
                    UINT32(Integer.BYTES),
                    UINT64(Long.BYTES);

                    public final int size;

                    IndexLayout(int size) {
                        this.size = size;
                    }

                    public static IndexLayout get(int i) {
                        return values()[i];
                    }
                }

                var idxLayout = IndexLayout.get((int) info.polygonType());
                var rareCandyIndexLayout = switch (idxLayout) {
                    case UINT8 -> IndexType.UNSIGNED_BYTE;
                    case UINT16 -> IndexType.UNSIGNED_SHORT;
                    case UINT32 -> IndexType.UNSIGNED_INT;
                    case UINT64 -> throw new RuntimeException("What the fuck how big is this model damn 💀💀 change your index type from int64 your indices are blow 2_147_483_647 most likely");
                };

                var rawAttributes = info.attributes(0);

                enum AttributeType {
                    NONE,
                    POSITION,
                    NORMAL,
                    TANGENT,
                    BINORMAL,
                    COLOR,
                    TEXCOORD,
                    BLEND_INDICES,
                    BLEND_WEIGHTS;

                    public static AttributeType get(long id) {
                        for (var i = 0; i < values().length; i++) if (i == id) return values()[i];
                        throw new RuntimeException("Unknown Attribute Type " + id);
                    }
                }

                enum AttributeSize {
                    NONE(0, 0),
                    RGBA_8_UNORM(20, Byte.BYTES * 4),
                    RGBA_8_UNSIGNED(22, Byte.BYTES * 4),
                    R32_UINT(36, Integer.BYTES),
                    R32_INT(37, Integer.BYTES),
                    RGBA_16_UNORM(39, Short.BYTES * 4),
                    RGBA_16_FLOAT(43, Short.BYTES * 4),
                    RG_32_FLOAT(48, Float.BYTES * 2),
                    RGB_32_FLOAT(51, Float.BYTES * 3),
                    RGBA_32_FLOAT(54, Float.BYTES * 4);

                    public final int id;
                    public final int size;

                    AttributeSize(int id, int size) {
                        this.id = id;
                        this.size = size;
                    }

                    public static AttributeSize get(long id) {
                        for (var value : values()) if (value.id == id) return value;
                        throw new RuntimeException("Unknown Attribute Size " + id);
                    }
                }

                record Attribute(
                        AttributeType type,
                        AttributeSize size
                ) {
                }

                var svAttribs = new ArrayList<Attribute>();
                for (var j = 0; j < rawAttributes.attrsLength(); j++) {
                    svAttribs.add(new Attribute(
                            AttributeType.get(rawAttributes.attrs(j).attribute()),
                            AttributeSize.get(rawAttributes.attrs(j).type())
                    ));
                }

                var rarecandyAttribs = svAttribs.stream().map(attribute -> {
                    var glType = switch (attribute.size) {
                        case NONE ->
                                throw new RuntimeException("Trinity model with NONE attribute found. Import failed");
                        case RGBA_8_UNORM, RGBA_8_UNSIGNED -> GL_UNSIGNED_BYTE;
                        case R32_UINT -> GL_UNSIGNED_INT;
                        case R32_INT -> GL_INT;
                        case RGBA_16_UNORM -> GL_UNSIGNED_SHORT;
                        case RGBA_16_FLOAT -> GL_HALF_FLOAT;
                        case RG_32_FLOAT, RGBA_32_FLOAT, RGB_32_FLOAT -> GL_FLOAT;
                    };

                    var amount = switch (attribute.size) {
                        case NONE ->
                                throw new RuntimeException("Trinity model with NONE attribute found. Import failed");
                        case RGBA_8_UNORM, RGBA_8_UNSIGNED, RGBA_32_FLOAT, RGBA_16_FLOAT, RGBA_16_UNORM -> 4;
                        case RGB_32_FLOAT -> 3;
                        case RG_32_FLOAT -> 2;
                        case R32_UINT, R32_INT -> 1;
                    };

                    return new gg.generations.rarecandy.arceus.model.lowlevel.Attribute(glType, amount);
                }).toList();

                // Sub meshes
                var subMeshes = new ArrayList<MeshBatch.SubMesh>();

                for (int j = 0; j < info.materialsLength(); j++) {
                    var subMesh = info.materials(j);
                    var indexOffset = subMesh.polyOffset();
                    var indexCount = subMesh.polyCount();
                    var material = subMesh.materialName();
                    subMeshes.add(new MeshBatch.SubMesh(indexOffset, indexCount, material));
                }

                throw new RuntimeException("MISSING SHADER CODE :(");
//                model.meshes.add(new MeshBatch(null, new RenderData(DrawMode.TRIANGLES, new VertexData(vertexBuffer, rarecandyAttribs), idxBuffer.bufferAsByteBuffer(), rareCandyIndexLayout, -1), subMeshes));
            }
        }

        // Skeleton
        List<ModelNode> nodes = new ArrayList<>();
        List<ModelNode> skeleton = new ArrayList<>();

        // First bone pass. Get all raw info into a normal format
        for (int i = 0; i < trskl.transformNodesLength(); i++) {
            var bone = trskl.transformNodes(i);

            var rawTransform = toVec3(bone.transform().vecTranslate());
            var rawRotation = toVec3(bone.transform().vecRot());
            var rawScale = toVec3(bone.transform().vecScale());

            var localTransform = new Matrix4f();

            if (!(rawTransform.x == 0 && rawTransform.y == 0 && rawTransform.z == 0))
                localTransform.translate(rawTransform);

            if (!(rawRotation.x == 0 && rawRotation.y == 0 && rawRotation.z == 0))
                localTransform.rotate(new Quaternionf().rotateLocalX(rawRotation.x).rotateLocalY(rawRotation.y).rotateLocalZ(rawRotation.z));

            if (!(rawScale.x == 1 && rawScale.y == 1 && rawScale.z == 1)) localTransform.scale(rawScale);

            // Find parent
            ModelNode parent = null;
            if (bone.parentIdx() != -1) parent = nodes.get(bone.parentIdx());

            var node = new ModelNode(bone.name(), localTransform, parent);
            if (bone.rigIdx() != -1) skeleton.add(bone.rigIdx(), node);
            nodes.add(node);
        }

        // Second bone pass. Add children
        for (var value : nodes) if (value.parent != null) value.parent.children.add(value);
        model.armature = nodes.get(0);
        System.out.println("Trinity Model imported");
    }

    private static Optional<TRMMT> locateTrmmt(Path parent, String trmdlPath) {
        var possiblePath = parent.resolve(trmdlPath.replace("trmtr", "trmmt"));
        if (Files.exists(possiblePath)) return Optional.of(TRMMT.getRootAsTRMMT(read(possiblePath)));
        return Optional.empty();
    }

    public static void handleFile(Path path, EditorLogic editor) {
        System.out.println("Opening File " + path);
        var extension = getFileExtension(path);

        switch (extension) {
            case "trmdl" -> importModel(path, editor);
            // TODO: data files
            // TODO: scene formats
            default ->
                    JOptionPane.showMessageDialog(null, path + " cannot be opened. Reason: unknown extension \"" + extension + "\"", "File Import", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String getFileExtension(Path path) {
        return Optional.of(path.getFileName().toString())
                .filter(f -> f.contains("."))
                .map(f -> f.substring(f.lastIndexOf(".") + 1)).orElse("");
    }

    private static ByteBuffer read(Path path) {
        try {
            return ByteBuffer.wrap(Files.readAllBytes(path));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read " + path.getFileName(), e);
        }
    }

    private static Vector3f toVec3(Vec3 vec) {
        return new Vector3f(vec.x(), vec.y(), vec.z());
    }
}
