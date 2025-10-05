# kotlin-autotest

This repository contains a minimal Kotlin project setup using Gradle.

## Project Structure

- `build.gradle.kts` — Gradle build script (Kotlin DSL)
- `settings.gradle.kts` — Gradle settings
- `src/main/kotlin/Main.kt` — Main Kotlin source file

## How to Build and Run

1. **Initialize Gradle Wrapper (if not present):**
   ```sh
   gradle wrapper
   ```
2. **Build the project:**
   ```sh
   ./gradlew build
   ```
3. **Run the application:**
   ```sh
   ./gradlew run
   ```

## Requirements
- JDK 8 or higher
- Gradle 7.x or higher (or use the wrapper)

## Main Entry Point

The main function is located in `src/main/kotlin/Main.kt`.

---

This is a minimal setup. You can expand it with tests and additional dependencies as needed.

