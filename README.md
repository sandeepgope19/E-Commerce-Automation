# 🛒 E-Commerce Automation Testing Framework

A robust and scalable **Automation Testing Framework** for an E-Commerce web application built using **Java, Selenium WebDriver, TestNG, and Maven**.

This framework follows the **Page Object Model (POM)** design pattern and supports **data-driven testing, cross-browser execution, logging, reporting, and Docker-based execution**.

---

## 🚀 Features

### 📝 Account Registration Automation
- Automated end-to-end account registration flow  
- Reusable `BasePage` class implementation  
- Page classes: `HomePage`, `AccountRegistrationPage`  
- Test case: `TC_001_AccountRegistrationTest`

---

### 🔐 Login Automation
- Automated login functionality  
- Page classes: `LoginPage`, `MyAccountPage`  
- Test case: `TC_002_LoginTest`

---

### 📊 Data-Driven Testing (DDT)
- Implemented using **Apache POI (Excel)**  
- Utility classes: `ExcelUtility`, `DataProviders`  
- Test case: `TC_003_LoginDDT`  
- Covers multiple login scenarios  
- Includes logout validation  

---

### 🔍 Product Search & Cart
- Product search automation  
- Add-to-cart functionality  
- Test cases:
  - `TC_004_SearchProductTest`  
  - `TC_005_AddToCartPageTest`

---

### 🔁 End-to-End Testing
- Full user journey automation:
  - Login → Search → Add to Cart → Checkout  
- Test case: `TC_006_EndToEndTest`

---

## 🏗️ Framework Design

- Implemented **Page Object Model (POM)**  
- Centralized WebDriver setup in `BaseClass`  
- Clean separation of:
  - Page Objects  
  - Test Cases  
  - Utilities  

---

## 🌐 Cross-Browser & Parallel Execution

- Configured via **TestNG XML**  
- Supports Chrome & Firefox  
- Parallel execution enabled  

---

## ⚙️ Configuration Management

- Externalized config using `config.properties`  
- Removed hard-coded values  
- Dynamic configuration loading  

---

## 📊 Logging

- Integrated **log4j2**  
- Config file: `log4j2.xml`  
- Logging implemented in base class and test cases  

---

## 📈 Reporting & Test Execution

- Integrated **Extent Reports**  
- Screenshot capture on failure  
- TestNG Listeners implemented  

Re-run failed tests:
```
testng-failed.xml
```

---

## 🐳 Docker + Selenium Grid

- Dockerized execution  
- Selenium Grid (Hub + Nodes)  
- RemoteWebDriver support  

Grid URL:
```
http://localhost:4444
```

---

## ▶️ Test Execution Methods

### 1. Run Tests using Maven (pom.xml)

```
mvn clean test
```

Run specific TestNG suite:
```
mvn test -DsuiteXmlFile=testng.xml
```

---

### 2. Run Tests using Command Prompt

```
cd E-Commerce-Automation
mvn clean install
mvn test
```

---

### 3. Run Tests using run.bat file

Create `run.bat` in project root:

```
@echo off
cd /d %~dp0
mvn clean test
pause
```

---

## 🔁 Version Control (Git & GitHub)

```
git init
git add .
git commit -m "Initial commit - Automation Framework"
git branch -M main
git remote add origin https://github.com/sandeepgope19/E-Commerce-Automation.git
git push -u origin main
```

---

## 🤖 CI/CD Integration (Jenkins)

### Run Tests using Jenkins

1. Install Jenkins  
2. Install plugins:
   - Maven Integration Plugin  
   - Git Plugin  

3. Create Job (Freestyle or Pipeline)  

4. Add build step:
```
mvn clean test
```

5. Click **Build Now**

---

## 🧰 Tech Stack

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Apache POI  
- log4j2  
- Extent Reports  
- Docker  
- Selenium Grid  
- Git & GitHub  
- Jenkins  

---

## 📂 Project Structure

E-Commerce-Automation
│── src/test/java
│   ├── pageObjects
│   │   ├── BasePage.java
│   │   ├── HomePage.java
│   │   ├── AccountRegistrationPage.java
│   │   ├── LoginPage.java
│   │   ├── MyAccountPage.java
│   │   ├── SearchPage.java
│   │   ├── ShoppingCartPage.java
│   │   ├── CheckoutPage.java
│
│   ├── testCases
│   │   ├── TC_001_AccountRegistrationTest.java
│   │   ├── TC_002_LoginTest.java
│   │   ├── TC_003_LoginDDT.java
│   │   ├── TC_004_SearchProductTest.java
│   │   ├── TC_005_AddToCartPageTest.java
│   │   ├── TC_006_EndToEndTest.java
│
│   ├── testBase
│   │   ├── BaseClass.java
│
│   ├── utilities
│   │   ├── ExcelUtility.java
│   │   ├── DataProviders.java
│   │   ├── ExtentReportManager.java
│
│── src/test/resources
│   ├── config.properties
│   ├── log4j2.xml
│
│── testData
│   ├── LoginData.xlsx
│
│── testng.xml
│── pom.xml

---

## 👨‍💻 Author

**Sandeep Gope**

---

## 🔗 Project Link

https://github.com/sandeepgope19/E-Commerce-Automation
