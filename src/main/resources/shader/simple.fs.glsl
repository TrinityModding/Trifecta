#version 330 core

in vec4 color;
in vec2 fragTexCoord;
out vec4 outColor;
uniform sampler2D textureSampler;


void main() {
    outColor = texture(textureSampler, fragTexCoord);
}