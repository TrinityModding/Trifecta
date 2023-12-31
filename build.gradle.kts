import com.osmerion.gradle.lwjgl3.*

plugins {
    id("java")
    id("com.osmerion.lwjgl3") version "0.1.0"
}

group = "me.hydos.trifecta"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}

sourceSets {
    create("flatGen")
}

lwjgl3 {
    targets {
        named("main") {
            modules.add(LWJGL.Core)
            modules.add(LWJGL.GLFW)
            modules.add(LWJGL.OpenGL)
            modules.add(LWJGL.Nuklear)
            modules.add(LWJGL.STB)
            modules.add(LWJGL.ParShapes)

            linuxX64()
            macosX64()
            windowsX64()
        }
    }
}

repositories {
    mavenCentral()
    maven("https://maven.generations.gg/snapshots")
    maven("https://maven.generations.gg/releases")
    maven("https://jitpack.io")
}

dependencies {
    implementation(files("deps/luaj-3.0.3.jar"))

    implementation("com.google.flatbuffers", "flatbuffers-java", "23.3.3")

    implementation("org.joml", "joml", "1.10.5")
    implementation("gg.generations:RareCandy:3.0.0-SNAPSHOT")
    implementation(files("libs/dds-lwjgl-2.1.0.jar"))
}