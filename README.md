# 🛒 E-Commerce Automation Testing Framework

A robust and scalable **Automation Testing Framework** for an E-Commerce web application built using **Java, Selenium WebDriver, TestNG, and Maven**.

This framework follows the **Page Object Model (POM)** design pattern and supports **data-driven testing, cross-browser execution, logging, and configuration management**.

---

## 🚀 Features

### 📝 Account Registration Automation
- Automated Account Registration Test Case  
- Created reusable BasePage class  
- Developed HomePage and RegistrationPage  
- Implemented AccountRegistrationTest  

---

### 🏗️ Framework Design
- Implemented Page Object Model (POM)  
- Created BaseClass for setup and teardown  
- Added reusable methods:
  - Random string generator  
  - Random number generator  

---

### 📊 Logging (log4j2)
- Integrated log4j2 logging  
- Added log4j2.xml configuration  
- Logging implemented in test cases and base class  

---

### 🌐 Cross-Browser & Parallel Execution
- Configured TestNG XML  
- Parameterized browser and OS  
- Enabled:
  - Cross-browser testing  
  - Parallel execution  

---

### ⚙️ Configuration Management
- Used config.properties for test data  
- Removed hard-coded values  
- Dynamic configuration loading  

---

### 🔐 Login Automation
- Automated login functionality  
- Created LoginPage and MyAccountPage  
- Implemented LoginTest  

---

### 📊 Data-Driven Testing
- Implemented data-driven testing using Excel  
- Used Apache POI  
- Created ExcelUtility and DataProviders  
- Tested multiple login scenarios  
- Added logout validation
- 
---

### 📈 Reporting & Test Execution (NEW 🔥)
- Integrated **Extent Reports** for detailed HTML reports  
- Implemented **screenshot capture on test failure**  
- Configured **TestNG Listeners** for reporting  
- Enabled **re-run of failed test cases** using `testng-failed.xml`

## 🧰 Tech Stack

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Page Object Model (POM)  
- log4j2  
- Apache POI
- Extent Reports 
- Git  

---

E-Commerce-Automation
│── src/test/java
│   ├── testCases
│   │   ├── AccountRegistrationTest
│   │   ├── LoginTest
│   │   ├── LoginDataDrivenTest
│   ├── pageObjects
│   │   ├── BasePage
│   │   ├── HomePage
│   │   ├── RegistrationPage
│   │   ├── LoginPage
│   │   ├── MyAccountPage
│   ├── testBase
│   │   ├── BaseClass
│   ├── utilities
│   │   ├── ExcelUtility
│   │   ├── DataProviders
│   │   ├── ExtentReportUtility
│
│── src/test/resources
│   ├── config.properties
│   ├── log4j2.xml
│
│── testData
│   ├── LoginData.xlsx
│
│── test-output   (ignored)
│── testng.xml
│── pom.xml
```

---

## ▶️ How to Run the Project

### 1. Clone Repository
```bash
git clone https://github.com/sandeepgope19/E-Commerce-Automation
cd E-Commerce-Automation
mvn clean install
```

### 2. Run Tests
- Run using `testng.xml`
- Re-run failed tests using `testng-failed.xml`

---

## 📸 Screenshots
- Test Execution Output
- TestNG Reports
- Extent Report (HTML)  

---

## 📌 Key Learnings
- Built a real-world automation framework
- Implemented POM design pattern
- Worked on data-driven testing
- Performed cross-browser and parallel execution
- Integrated logging and configuration management

---

## 👨‍💻 Author

**Sandeep Gope**

- Trainee Test Engineer
- Skilled in Manual & Automation Testing
- Selenium | Java | TestNG | API Testing

---

## ⭐ Future Enhancements
- CI/CD integration using Jenkins
- API Automation (Rest Assured)
- Docker execution

---

## 🔗 Project Link
https://github.com/sandeepgope19/E-Commerce-Automation

---

⭐ If you like this project, give it a star!
