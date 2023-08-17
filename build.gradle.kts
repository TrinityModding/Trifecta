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

lwjgl3 {
    targets {
        named("main") {
            modules.add(LWJGL.Core)
            modules.add(LWJGL.GLFW)
            modules.add(LWJGL.OpenGL)
            modules.add(LWJGL.Nuklear)
            modules.add(LWJGL.STB)

            linuxX64()
            macosX64()
            windowsX64()
        }
    }
}

repositories {
    mavenCentral()
    maven("https://maven.generations.gg")
}

dependencies {
    implementation("gg.generations:RareCandy:2.3.6-SNAPSHOT")
}