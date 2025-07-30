# TestPaperPlugin - Template Plugin for PaperMC 1.21.8

[![Gradle](https://img.shields.io/badge/Gradle-8.14.1-brightgreen.svg)](https://gradle.org)

[![Paper](https://img.shields.io/badge/Paper-1.21.8-blue.svg)](https://papermc.io)

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.java.net)

Template project for developing **Minecraft** plugins on **PaperMC** using **paperweight-userdev**.

Pre-configured environment for rapid plugin development with modern tooling support.

## 🚀 Features

- Fully configured environment for **`Paper 1.21.8`**
- **paperweight-userdev** for simplified development
- **Gradle 8.14.1** support
- Automatic **plugin.yml** generation
- Ready-to-use **Gradle** tasks for test server

## 📂 Project Structure

TestPaperPlugin/
├── .gradle/ # Кэш Gradle (автогенерируется)  
├── build/ # Собранные артефакты (автогенерируется)  
├── src/  
│ ├── main/  
│ │ ├── java/ # Исходные коды плагина  
│ │ └── resources/ # Ресурсы плагина (config.yml, lang и т.д.)  
│ └── test/ # Тесты (необязательно)  
├── gradle/ # Файлы обертки Gradle  
├── .gitignore # Игнорируемые файлы  
├── build.gradle.kts # Конфигурация сборки (главный файл)  
├── gradle.properties # Свойства Gradle  
├── gradlew # Gradle wrapper (Linux/Mac)  
├── gradlew.bat # Gradle wrapper (Windows)  
└── settings.gradle.kts # Настройки проекта

### Key Configuration Files

1.  **`build.gradle.kts`** - main configuration file:

    - Dependencies (Paper API, libraries)
    - Plugin settings (version, authors)
    - Gradle tasks (build, run server)
    - `plugin.yml` generation config

2.  **`settings.gradle.kts`** - project settings:

    - Project name
    - Plugin management
    - Repository settings

3.  **`generated-resources/main/plugin.yml`** - auto-generated plugin descriptor (do not edit manually)

## ⚙️ Настройка в различных IDE

### IntelliJ IDEA

1. Clone repository:

```bash
	git clone https://github.com/IAlexVoss/TestPaperPlugin.git
```

2. Open project in IntelliJ IDEA

3. Wait for Gradle project import and indexing

4. To run:

   - Open Gradle panel (right sidebar)
   - Expand Tasks → run-paper
   - Double-click runServer

### Eclipse

1. Install **Buildship** plugin (Gradle integration)

2. Import project:

   - File → Import → Gradle → Existing Gradle Project
   - Select project folder

3. Create run configuration:

   - Run → Run Configurations...
   - Gradle Task → New
   - Project: TestPaperPlugin
   - Tasks: runServer

4. Save and run

### Visual Studio Code

1. Install extensions:

   - **Java Extension Pack**
   - **Gradle for Java**

2. Open project folder

3. Allow Gradle project import when prompted

4. To run:

   - Open Gradle panel (elephant icon)
   - Expand project → Tasks → run-paper
   - Click runServer

## 🛠️ Gradle Commands

### Basic Commands

```bash

	# Start test server
	./gradlew  runServer


	# Build plugin JAR
	./gradlew  build


	# Clean project
	./gradlew  clean


	# Refresh dependencies
	./gradlew  --refresh-dependencies

```

### Useful Tasks

```bash

	# Start server in debug mode
	./gradlew  runServer  --debug-jvm


	# Regenerate plugin.yml
	./gradlew  generateBukkitPluginYaml


	# Show all available tasks
	./gradlew  tasks

```

## ⚙️ Plugin Configuration

Plugin settings in **`build.gradle.kts`**:

```java

	bukkitPluginYaml {
	main = "io.papermc.paperweight.testplugin.TestPlugin"  // Main class
	load = BukkitPluginYaml.PluginLoadOrder.STARTUP        // Load order
	authors.add("Author")                                  // Authors
	apiVersion = "1.21"                                    // API version

	// Additional parameters:
	// commands { ... }
	// permissions { ... }
	// depend = listOf("Vault")

	}

```

## 🔧 Troubleshooting

### Build Errors

```bash

	# Clean project and refresh dependencies
	./gradlew  clean  --refresh-dependencies


	# Delete Gradle cache
	rm  -rf  ~/.gradle/caches

```

### Common Issues

1.  **`Duplicate plugin.yml:`**

- Ensure there's no `plugin.yml` in `src/main/resources`

2.  **`Paperweight version issues:`**

- Verify version compatibility in `build.gradle.kts`

## 📝 License

This project is licensed under MIT. Feel free to use it as a base for your plugins.

<details> <summary><b>🇷🇺 Русская версия</b></summary>

[Читать на русском](README.ru.md)

</details>
