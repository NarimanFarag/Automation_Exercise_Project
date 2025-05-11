# 🧪 Automation Exercise Test Framework

The **Automation Exercise Project** is a test automation framework developed to automate functional testing of the [Automation Exercise](https://automationexercise.com/) e-commerce website.

This framework follows the **Page Object Model (POM)** design pattern and integrates the following technologies:

- **Selenium WebDriver** for browser automation
- **TestNG** for test execution
- **Log4j** for logging
- **Allure** for advanced test reporting

---

## 📌 Purpose and Scope

The automation framework aims to provide **reliable**, **maintainable**, and **scalable** test automation for verifying key functionalities of the Automation Exercise website, including:

- ✅ User registration and authentication  
- ✅ Product browsing and viewing  
- ✅ Contact form submission  
- ✅ Test cases page navigation  

The framework supports efficient regression testing and can be expanded to test additional website features.

---

## 🏗️ High-Level Architecture

The framework uses a **layered architecture** based on the **Page Object Model**, cleanly separating:

- Test logic  
- Page interactions  
- Web element definitions  

---

## 🔗 External Dependencies & Core Components

```plaintext
Test Class
   └── uses Page Objects
   └── extends BaseTests
         └── initializes Selenium WebDriver
         └── executed by TestNG
         └── logs with Log4j
         └── reports with Allure
```

---

## 📁 Key Components

### 🧩 Page Objects

| Page Object      | Purpose                         | Key Methods                              |
|------------------|----------------------------------|-------------------------------------------|
| `RegisterPage`   | User registration flow           | `enterName()`, `enterEmail()`, `clickOnRegister()` |
| `LoginPage`      | Login/logout functionality       | `enterEmail()`, `enterPassword()`, `clickOnLogin()` |
| `ContactUsPage`  | Contact form submission          | Form field input and submission methods   |
| `ProductsPage`   | Product browsing & visibility    | `clickOnProducts()`, `checkProductInfoVisibility()` |
| `TestCasesPage`  | Test cases page navigation       | Navigation and validation methods         |

> Each page object is implemented with consistent patterns of:
> - Element definitions
> - Actions and verification
> - Error handling and logging

---

## 🚀 Test Execution Flow

The test flow is managed by **TestNG**, enhanced with **Log4j** and **Allure**:

1. **Setup (`@BeforeClass`)**
   - Initialize browser with WebDriverManager
   - Navigate to base URL  
2. **Test Execution**
   - Create Page Object instance
   - Perform actions via methods
   - Interact with elements
   - Log operations
3. **Teardown (`@AfterClass`)**
   - Close browser
4. **Reporting**
   - Generate Allure reports
   - Output logs with Log4j

---

## 🛠️ Technology Stack

| Component              | Technology         | Version   | Purpose                                 |
|------------------------|--------------------|-----------|------------------------------------------|
| Browser Automation     | Selenium WebDriver | 4.31.0    | Automate browser interactions            |
| Test Framework         | TestNG             | 7.10.2    | Organize and execute tests               |
| WebDriver Management   | WebDriverManager   | 5.9.2     | Auto-download correct driver binaries    |
| Logging                | Log4j              | 2.24.3    | Capture test execution logs              |
| Reporting              | Allure             | 2.29.1    | Generate rich HTML test reports          |
| Build Tool             | Maven              | -         | Dependency and project management        |

---

## 📘 Logging Implementation

Log4j is used extensively for tracking:

- Page object creation
- Element interaction attempts
- Successes and failures
- Exception details with stack traces

### Log Levels Used:

- `INFO` – Object creation  
- `DEBUG` – Successful interactions  
- `TRACE` – Element location attempts  
- `ERROR` – Caught exceptions  

```java
try {
    // Locate and interact with element
    logger.debug("Action completed successfully");
} catch (Exception e) {
    logger.trace("Error exception details", e);
}
```

---

## ✅ Functional Test Coverage

| Functionality        | Page Object         | Test Class         |
|----------------------|---------------------|---------------------|
| User Registration    | `RegisterPage`      | `RegisterTests`     |
| Login / Logout       | `LoginPage`         | `LoginTests`        |
| Product Browsing     | `ProductsPage`      | `ProductsTests`     |
| Contact Form         | `ContactUsPage`     | `ContactUsTests`    |
| Test Cases Page      | `TestCasesPage`     | `TestCasesTests`    |

> Robust error handling is applied in all tests to ensure resilience against UI or timing issues.

---

## 📂 Project Structure (Sample)

```
src/
├── test/
│   └── java/
│       └── Pages/
│           ├── RegisterPage.java
│           ├── LoginPage.java
│           ├── ProductsPage.java
│           └── ...
├── logs/
│   └── automation-log.log
pom.xml
```

---

## 📣 Notes

- The framework is **modular and extendable** for future website features.
- **Allure reports** and **Log4j logs** provide detailed insights during test execution.

---

## 📌 References

- [Automation Exercise Website](https://automationexercise.com/)
- `src/test/java/Pages/` – All Page Object classes  
- `pom.xml` – Project dependencies and plugins  
- `logs/automation-log.log` – Execution logs  
