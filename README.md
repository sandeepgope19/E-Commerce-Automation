# 🛒 E-Commerce Automation Testing Framework

## 📌 Overview

This project is a Selenium-based automation testing framework developed using Java, Maven, and TestNG to validate core functionalities of an e-commerce web application. It covers both manual and automated testing approaches with a focus on scalability and maintainability.

---

## 🧰 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Log4j2

---

## ⚙️ Framework Features

* Page Object Model (POM) design pattern
* Reusable BaseClass and Page Objects
* Utility methods for test data generation
* Logging using Log4j2 for better debugging and traceability
* Configuration management using properties file
* Cross-browser testing (Chrome, Edge)
* Parallel test execution using TestNG

---

## 📂 Project Structure

* `pageObjects` – Page classes for UI interactions
* `testCases` – Test scripts
* `testBase` – Base setup and reusable methods
* `testng.xml` – Test execution configuration
* `testng-parallel.xml` – Parallel execution setup
* `config.properties` – Environment configuration
* `log4j2.xml` – Logging configuration

---

## ▶️ How to Run Tests

### Run using TestNG

```bash id="v98iyh"
mvn test
```

### Run using XML

* Run `testng.xml` for single browser
* Run `testng-parallel.xml` for parallel execution

---

## 🚀 Key Highlights

* Automated user workflows like account registration
* Implemented scalable and maintainable automation framework
* Enabled parallel execution to improve test efficiency
* Integrated logging for better debugging

---

## 👨‍💻 Author

Sandeep Gope
