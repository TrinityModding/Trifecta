package me.hydos.trifecta.renderer;

import org.lwjgl.BufferUtils;
import org.lwjgl.nuklear.*;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.nuklear.Nuklear.*;
import static org.lwjgl.system.MemoryStack.stackPush;

class EditorUi {
    private static final NkRect RECT = NkRect.malloc();
    private static final NkVec2 VEC2 = NkVec2.malloc();

    private static final int EASY = 0;
    private static final int HARD = 1;
    public final NkColorf clearCol = NkColorf.create().r(0.62f).g(0.74f).b(0.84f).a(1.0f);
    private final IntBuffer compression = BufferUtils.createIntBuffer(1).put(0, 20);
    private int option = EASY;
    private final ByteBuffer bodySelected = BufferUtils.createByteBuffer(1).put(0, (byte) 0);
    private final ByteBuffer lEyeSelected = BufferUtils.createByteBuffer(1).put(0, (byte) 0);
    private final ByteBuffer rEyeSelected = BufferUtils.createByteBuffer(1).put(0, (byte) 0);

    public void render(NkContext ctx, int windowWidth, int windowHeight) {
        try (var stack = stackPush()) {
            if (nk_begin(ctx, "Toolbar", nk_rect(0, 0, 1920, 35, RECT), NK_WINDOW_NO_SCROLLBAR)) {

                nk_menubar_begin(ctx);
                nk_layout_row_static(ctx, 30, 50, 4);
                if (nk_menu_begin_label(ctx, "File", NK_TEXT_CENTERED, nk_vec2(110, 120, VEC2))) {
                    nk_layout_row_dynamic(ctx, 25, 1);
                    nk_menu_begin_label(ctx, "Import", NK_TEXT_LEFT, VEC2);
                    nk_menu_begin_label(ctx, "Open", NK_TEXT_LEFT, VEC2);
                    nk_menu_begin_label(ctx, "Export", NK_TEXT_LEFT, VEC2);
                    nk_menu_begin_label(ctx, "Next", NK_TEXT_LEFT, VEC2);
                    nk_menu_begin_label(ctx, "Prev", NK_TEXT_LEFT, VEC2);
                    nk_menu_end(ctx);
                }
                if (nk_menu_begin_label(ctx, "Help", NK_TEXT_CENTERED, nk_vec2(110, 120, VEC2))) {
                    nk_layout_row_dynamic(ctx, 25, 1);
                    nk_menu_begin_label(ctx, "Discord", NK_TEXT_LEFT, VEC2);
                    nk_menu_begin_label(ctx, "About", NK_TEXT_LEFT, VEC2);
                    nk_menu_end(ctx);
                }
                nk_menubar_end(ctx);
            }
            nk_end(ctx);

            if (nk_begin(ctx, "Scene", nk_rect(0, 35, 340, 990, RECT), NK_WINDOW_SCALABLE | NK_WINDOW_TITLE)) {
                nk_layout_row_dynamic(ctx, 25, 1);
                // Inside the main loop
                if (nk_tree_push_hashed(ctx, NK_TREE_TAB, "untitled.trscn", NK_MAXIMIZED, stack.UTF8("untitled.trscn"), 1)) {
                    // Add your tree nodes here
                    if (nk_tree_push_hashed(ctx, NK_TREE_NODE, "pm0001", NK_MINIMIZED, stack.UTF8("pm0001"), 1)) {
                        nk_layout_row_dynamic(ctx, 25, 1);
                        if (nk_selectable_label(ctx, "pm0001_body", NK_TEXT_LEFT, bodySelected)) {
                            bodySelected.put(0, (byte) 1);
                            lEyeSelected.put(0, (byte) 0);
                            rEyeSelected.put(0, (byte) 0);
                        }
                        if (nk_selectable_label(ctx, "pm0001_eye_l", NK_TEXT_LEFT, lEyeSelected)) {
                            bodySelected.put(0, (byte) 0);
                            lEyeSelected.put(0, (byte) 1);
                            rEyeSelected.put(0, (byte) 0);
                        }
                        if (nk_selectable_label(ctx, "pm0001_eye_r", NK_TEXT_LEFT, rEyeSelected)) {
                            bodySelected.put(0, (byte) 0);
                            lEyeSelected.put(0, (byte) 0);
                            rEyeSelected.put(0, (byte) 1);
                        }
                        nk_tree_pop(ctx);
                    }

                    nk_layout_row_dynamic(ctx, 25, 1);

                    // Add more tree nodes here

                    nk_tree_pop(ctx);
                }

            }
            nk_end(ctx);

            if (nk_begin(ctx, "Properties", nk_rect(1920 - 340, 35, 340, 990, RECT), NK_WINDOW_SCALABLE | NK_WINDOW_TITLE | NK_WINDOW_SCALE_LEFT)) {
                nk_layout_row_static(ctx, 30, 80, 1);
                if (nk_button_label(ctx, "button")) System.out.println("button pressed");

                nk_layout_row_dynamic(ctx, 30, 2);
                if (nk_option_label(ctx, "easy", option == EASY)) option = EASY;
                if (nk_option_label(ctx, "hard", option == HARD)) option = HARD;

                nk_layout_row_dynamic(ctx, 25, 1);
                nk_property_int(ctx, "Slider:", 0, compression, 100, 10, 1);

                nk_layout_row_dynamic(ctx, 20, 1);
                nk_label(ctx, "background:", NK_TEXT_LEFT);
                nk_layout_row_dynamic(ctx, 25, 1);
                if (nk_combo_begin_color(ctx, nk_rgb_cf(clearCol, NkColor.malloc(stack)), NkVec2.malloc(stack).set(nk_widget_width(ctx), 400))) {
                    nk_layout_row_dynamic(ctx, 120, 1);
                    nk_color_picker(ctx, clearCol, NK_RGBA);
                    nk_layout_row_dynamic(ctx, 25, 1);
                    clearCol.r(nk_propertyf(ctx, "#R:", 0, clearCol.r(), 1.0f, 0.01f, 0.005f))
                            .g(nk_propertyf(ctx, "#G:", 0, clearCol.g(), 1.0f, 0.01f, 0.005f))
                            .b(nk_propertyf(ctx, "#B:", 0, clearCol.b(), 1.0f, 0.01f, 0.005f))
                            .a(nk_propertyf(ctx, "#A:", 0, clearCol.a(), 1.0f, 0.01f, 0.005f));
                    nk_combo_end(ctx);
                }
            }
            nk_end(ctx);
        }
    }

}