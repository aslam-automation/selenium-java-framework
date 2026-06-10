# Selenium Java Automation Framework

## Overview

A scalable Selenium WebDriver automation framework built using Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

This framework demonstrates industry-standard automation practices including:

* Page Object Model (POM)
* TestNG Test Execution
* Maven Build Management
* Data-Driven Testing
* Reusable Utilities
* Reporting
* CI/CD Ready Structure

---

## Technology Stack

| Technology         | Purpose               |
| ------------------ | --------------------- |
| Java               | Programming Language  |
| Selenium WebDriver | UI Automation         |
| TestNG             | Test Execution        |
| Maven              | Dependency Management |
| Git                | Version Control       |
| GitHub Actions     | CI/CD                 |
| JSON               | Test Data Management  |

---

## Framework Features

* Page Object Model Design Pattern
* Reusable Test Components
* Centralized Configuration Management
* Test Data Separation
* Cross Browser Support (Future Enhancement)
* Screenshot Capture on Failure
* CI/CD Integration Ready

---

## Project Structure

```text
selenium-java-framework
│
├── src
│   ├── main
│   │   └── java
│   │       ├── pages
│   │       ├── utils
│   │       └── base
│   │
│   └── test
│       └── java
│           ├── tests
│           └── base
│
├── test-data
├── reports
├── pom.xml
├── testng.xml
└── README.md
```

---

## Sample Test Flow

1. Launch Browser
2. Navigate to Application
3. Login Using Valid Credentials
4. Verify User Access
5. Logout
6. Close Browser

---

## Test Execution

Run all tests:

```bash
mvn test
```

Run TestNG Suite:

```bash
mvn clean test
```

---

## Reporting

Execution reports are generated under:

```text
/reports
```

---

## CI/CD

GitHub Actions workflow can be configured to:

* Trigger on Push
* Trigger on Pull Request
* Execute Regression Suite
* Publish Test Results

---

## Future Enhancements

* Docker Integration
* Parallel Execution
* Allure Reporting
* Selenium Grid Support
* BrowserStack Integration

---

## Author

Muhammed Aslam

QA Automation Engineer | Selenium | Playwright | FlaUI | Java | C#

Location: Kochi, Kerala, India

LinkedIn:
https://www.linkedin.com/in/mohamedaslam

GitHub:
https://github.com/aslam-automation

