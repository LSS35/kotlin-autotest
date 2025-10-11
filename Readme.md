# kotlin-autotest
A minimal, clean Kotlin project setup for automated testing with Gradle and GitHub Actions CI.

[![CI](https://github.com/LSS35/kotlin-autotest/actions/workflows/ci.yml/badge.svg)](https://github.com/LSS35/kotlin-autotest/actions/workflows/ci.yml) [![Qodana](https://github.com/LSS35/kotlin-autotest/actions/workflows/qodana_code_quality.yml/badge.svg)](https://github.com/LSS35/kotlin-autotest/actions/workflows/qodana_code_quality.yml)

---

## Table of Contents
- [Requirements](#requirements)
- [Project Structure](#project-structure)
- [How to Run Tests](#how-to-run-tests)
- [Notes](#notes)

---

## Requirements
- JDK 21 or newer
- Gradle (wrapper included, no manual install needed)

## Project Structure
```
├── build.gradle.kts         # Gradle build script (Kotlin DSL)
├── settings.gradle.kts      # Gradle settings
├── src/
│   └── test/
│       └── kotlin/          # Kotlin test sources
```

## How to Run Tests

```sh
./gradlew test
```

---

## Notes
- This is a minimal setup for Kotlin test automation.
- Expand it with your own tests and dependencies as needed.
- CI and code quality checks run automatically on all branches via GitHub Actions.
