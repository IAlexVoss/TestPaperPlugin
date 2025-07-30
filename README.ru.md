# TestPaperPlugin - Шаблон плагина для PaperMC 1.21.8

[![Gradle](https://img.shields.io/badge/Gradle-8.14.1-brightgreen.svg)](https://gradle.org)

[![Paper](https://img.shields.io/badge/Paper-1.21.8-blue.svg)](https://papermc.io)

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.java.net)

Шаблонный проект для разработки плагинов **Minecraft** на **PaperMC** с использованием **paperweight-userdev**.

Проект настроен для быстрого старта разработки с поддержкой современных инструментов.

## 🚀 Особенности

- Полностью настроенная среда для **`Paper 1.21.8`**
- Использование **paperweight-userdev** для упрощения разработки
- Поддержка **Gradle 8.14.1**
- Автоматическая генерация **plugin.yml**
- Готовые задачи **Gradle** для запуска тестового сервера

## 📂 Структура проекта

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

### Ключевые файлы конфигурации

1.  **`build.gradle.kts`** - основной файл конфигурации:

    - Зависимости (Paper API, библиотеки)
    - Настройки плагина (версия, авторы)
    - Задачи Gradle (сборка, запуск сервера)
    - Конфигурация генерации `plugin.yml`

2.  **`settings.gradle.kts`** - настройки проекта:

    - Имя проекта
    - Управление плагинами
    - Настройки репозиториев

3.  **`generated-resources/main/plugin.yml`** - автоматически генерируемый файл описания плагина (не редактировать вручную)

## ⚙️ Настройка в различных IDE

### IntelliJ IDEA

1. Клонируйте репозиторий:

```bash
git clone https://github.com/IAlexVoss/TestPaperPlugin.git
```

2. Откройте проект в IntelliJ IDEA

3. Дождитесь индексации и импорта Gradle проекта

4. Для запуска:

   - Откройте панель Gradle (справа)
   - Разверните Tasks → run-paper
   - Дважды кликните на runServer

### Eclipse

1. Установите плагин **Buildship** (Gradle integration)

2. Импортируйте проект:

   - File → Import → Gradle → Existing Gradle Project
   - Укажите папку проекта

3. После импорта создайте конфигурацию запуска:

   - Run → Run Configurations...
   - Gradle Task → New
   - Project: TestPaperPlugin
   - Tasks: runServer

4. Сохраните и запустите

### Visual Studio Code

1. Установите расширения:

   - **Java Extension Pack**
   - **Gradle for Java**

2. Откройте папку проекта

3. При запросе разрешения на импорт Gradle проекта - согласитесь

4. Для запуска:

   - Откройте панель Gradle (иконка слона)
   - Разверните проект → Tasks → run-paper
   - Кликните на runServer

## 🛠️ Команды Gradle

### Основные команды

- Запустить тестовый сервер:

```bash
./gradlew  runServer
```

- Собрать JAR-файл плагина:

```bash
./gradlew  build
```

- Очистить проект:

```bash
./gradlew  clean
```

- Обновить зависимости:

```bash
./gradlew  --refresh-dependencies
```

### Полезные задачи

- Запустить сервер с отладочным режимом:

```bash
./gradlew  runServer  --debug-jvm
```

- Перегенерировать `plugin.yml`:

```bash
./gradlew  generateBukkitPluginYaml
```

- Показать все доступные задачи:

```bash
./gradlew  tasks
```

## ⚙️ Настройка плагина

Конфигурация плагина в **`build.gradle.kts`**:

```java
bukkitPluginYaml {
main = "io.papermc.paperweight.testplugin.TestPlugin"  // Главный класс
load = BukkitPluginYaml.PluginLoadOrder.STARTUP  	   // Время загрузки
authors.add("Author") 								   // Авторы
apiVersion = "1.21"  								   // Версия API

// Дополнительные параметры:
// commands { ... }
// permissions { ... }
// depend = listOf("Vault")

}
```

## 🔧 Решение проблем

### Ошибки сборки

- Очистите проект и обновите зависимости:

```bash
./gradlew  clean  --refresh-dependencies
```

- Удалите кэш Gradle:

```bash
rm  -rf  ~/.gradle/caches
```

### Распространенные ошибки

1.  **`Duplicate plugin.yml:`**

- Убедитесь, что в `src/main/resources` нет файла `plugin.yml`

2.  **`Paperweight version issues:`**

- Проверьте совместимость версий в `build.gradle.kts`

## 📝 Лицензия

Этот проект распространяется под лицензией MIT. Вы можете свободно использовать его в качестве основы для своих плагинов.

<details><summary><b>🇬🇧 English version</b></summary>

[Read in English](readme.md)

</details>
