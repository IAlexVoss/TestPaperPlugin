import xyz.jpenilla.resourcefactory.bukkit.BukkitPluginYaml

plugins {
    id("java")
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.18"
    id("xyz.jpenilla.run-paper") version "2.3.1" // Adds runServer and runMojangMappedServer tasks for testing
    id("xyz.jpenilla.resource-factory-bukkit-convention") version "1.3.0" // Generates plugin.yml based on the Gradle config
}

group = "io.github.ialexvoss.fm"
version = "1.0-SNAPSHOT"
description = "Test plugin for paperweight-userdev"

java {
    // Configure the java toolchain. This allows gradle to auto-provision JDK 21 on systems that only have JDK 11 installed for example.
    toolchain.languageVersion = JavaLanguageVersion.of(21)
}

repositories {
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    paperweight.paperDevBundle("1.21.8-R0.1-SNAPSHOT")
}

tasks {
    compileJava {
        // Set the release flag. This configures what version bytecode the compiler will emit, as well as what JDK APIs are usable.
        // See https://openjdk.java.net/jeps/247 for more information.
        options.release = 21
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything
    }
}

bukkitPluginYaml {
//    name = "TestPaperPlugin"
//    version = "1.0-SNAPSHOT"
    main = "io.github.ialexvoss.fm.TestPaperPlugin"
    description = "An a my first test paper plugin"
    authors.add("IAlexVoss")
    website = "https://github.com/IAlexVoss"
    apiVersion = "1.21.8"
    prefix = "AmazingTestPaperPlugin"
}