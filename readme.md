# TestPaperPlugin - Шаблон плагина для PaperMC 1.21.8

[![Gradle](https://img.shields.io/badge/Gradle-8.14.1-brightgreen.svg)](https://gradle.org)
[![Paper](https://img.shields.io/badge/Paper-1.21.8-blue.svg)](https://papermc.io)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.java.net)

Шаблонный проект для разработки плагинов Minecraft на PaperMC с использованием Paperweight UserDev.  
Проект настроен для быстрого старта разработки с поддержкой современных инструментов.

## 🚀 Особенности

- Полностью настроенная среда для Paper 1.21.8
- Использование Paperweight UserDev для упрощения разработки
- Поддержка Gradle 8.14.1
- Автоматическая генерация plugin.yml
- Готовые задачи Gradle для запуска тестового сервера

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

1. **`build.gradle.kts`** - основной файл конфигурации:

   - Зависимости (Paper API, библиотеки)
   - Настройки плагина (версия, авторы)
   - Задачи Gradle (сборка, запуск сервера)
   - Конфигурация генерации `plugin.yml`

2. **`settings.gradle.kts`** - настройки проекта:

   - Имя проекта
   - Управление плагинами
   - Настройки репозиториев

3. **`generated-resources/main/plugin.yml`** - автоматически генерируемый файл описания плагина (не редактировать вручную)

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

1. Установите плагин Buildship (Gradle integration)

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

   - Java Extension Pack
   - Gradle for Java

2. Откройте папку проекта

3. При запросе разрешения на импорт Gradle проекта - согласитесь

4. Для запуска:

   - Откройте панель Gradle (иконка слона)
   - Разверните проект → Tasks → run-paper
   - Кликните на runServer

## 🛠️ Команды Gradle

### Основные команды

    ```bash
    # Запустить тестовый сервер
    ./gradlew runServer

    # Собрать JAR-файл плагина
    ./gradlew build

    # Очистить проект
    ./gradlew clean

    # Обновить зависимости
    ./gradlew --refresh-dependencies
    ```

### Полезные задачи

    ```bash
    # Запустить сервер с отладочным режимом
    ./gradlew runServer --debug-jvm

    # Перегенерировать plugin.yml
    ./gradlew generateBukkitPluginYaml

    # Показать все доступные задачи
    ./gradlew tasks
    ```

## ⚙️ Настройка плагина

Конфигурация плагина в build.gradle.kts:

    ```java
    bukkitPluginYaml {
    main = "io.papermc.paperweight.testplugin.TestPlugin" // Главный класс
    load = BukkitPluginYaml.PluginLoadOrder.STARTUP       // Время загрузки
    authors.add("Author")                                 // Авторы
    apiVersion = "1.21"                                   // Версия API
    // Дополнительные параметры:
    // commands { ... }
    // permissions { ... }
    // depend = listOf("Vault")
    }
    ```

## 🔧 Решение проблем

### Ошибки сборки

    ```bash
    # Очистите проект и обновите зависимости
    ./gradlew clean --refresh-dependencies

    # Удалите кэш Gradle
    rm -rf ~/.gradle/caches
    ```

### Распространенные ошибки

1. **`Duplicate plugin.yml:`**

   - Убедитесь, что в src/main/resources нет файла plugin.yml

2. **`Paperweight version issues:`**

   - Проверьте совместимость версий в build.gradle.kts

## 📝 Лицензия

Этот проект распространяется под лицензией MIT. Вы можете свободно использовать его в качестве основы для своих плагинов.
