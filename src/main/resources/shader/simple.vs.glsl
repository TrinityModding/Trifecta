#version 330 core

layout(location = 0) in vec3 inPosition;
layout(location = 1) in vec4 inNormal;
layout(location = 2) in vec4 inTangent;
layout(location = 3) in vec2 inTexCoord;
layout(location = 4) in vec4 inBoneIds;
layout(location = 5) in vec4 inBoneWeights;

out vec4 color;

uniform mat4 projectionMatrix;
uniform mat4 viewMatrix;
uniform mat4 modelMatrix;

void main() {
    mat4 modelViewProjectionMatrix = projectionMatrix * viewMatrix * modelMatrix;
    gl_Position = modelViewProjectionMatrix * vec4(inPosition, 1.0);
    color = vec4(gl_Position.rgb, 1.0);
}
