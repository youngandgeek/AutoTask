📌 Project Overview
This project is a Selenium Web Automation Framework built using:

Java
Selenium WebDriver
TestNG
Page Object Model (POM)
Maven (if applicable)
It is designed to test an e-commerce web application covering:

User registration
Login/logout
Product search
Add to cart
Checkout and payment flow
🏗️ Framework Structure
src

├── main
│ ├── java
│ │ ├── base
│ │ │ ├── BasePage
│ │ │ ├── BaseTest
│ │ │ └── DriverManager
│ │
│ │ ├── pages
│ │ │ ├── HomePage
│ │ │ ├── LoginSignupPage
│ │ │ ├── ProductsPage
│ │ │ ├── CartPage
│ │ │ ├── PaymentPage
│ │ │ └── RegisterPage

├── test
│ ├── java
│ │ ├── tests
│ │ │ ├── LoginTest
│ │ │ ├── RegisterTest
│ │ │ └── PurchaseTest

⚙️ Setup Instructions
1. Prerequisites
Java JDK 11+
Maven
Chrome browser
IntelliJ IDEA / Eclipse
2. Clone Project
git clone <repository-url>
cd <project-folder>
