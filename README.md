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
 │    ├── java
 │         ├── base
 │         │     ├── BasePage
 │         │     ├── BaseTest
 │         │     └── DriverManager
 │         │
 │         ├── pages
 │         │     ├── HomePage
 │         │     ├── LoginSignupPage
 │         │     ├── ProductsPage
 │         │     ├── CartPage
 │         │     ├── PaymentPage
 │         │     └── RegisterPage
 │
 ├── test
 │    ├── java
 │         ├── tests
 │              ├── LoginTest
 │              ├── RegisterTest
 │              ├── PurchaseTest
⚙️ Setup Instructions
1. Prerequisites

Make sure you have installed:

Java JDK 11 or higher
Maven
Chrome browser
IntelliJ IDEA or Eclipse
2. Clone the project
git clone <repository-url>
cd <project-folder>
3. Install dependencies

If using Maven:

mvn clean install
4. Configure WebDriver

Ensure ChromeDriver matches your Chrome version.

Optionally set path in:

DriverManager.java
🚀 How to Run Tests
▶️ Run all tests
mvn test
▶️ Run specific test class
mvn -Dtest=PurchaseTest test
▶️ Run using TestNG XML
testng.xml

Run via:

Right click → Run testng.xml
OR Maven command:
mvn test -DsuiteXmlFile=testng.xml
🧠 Framework Design
✔ Page Object Model (POM)

Each page contains:

Locators
Actions
No assertions (only in tests)
✔ BasePage

Contains reusable methods:

click()
type()
wait utilities
✔ BaseTest

Handles:

WebDriver initialization
Driver cleanup
Setup/teardown methods
✔ DriverManager

Handles:

WebDriver instance creation
Thread-safe execution (if parallel testing enabled)
🧪 Test Strategy
Types of tests covered:
Positive test cases
Negative test cases
End-to-end workflows
UI validations
🛒 Example Test Flow (Purchase)
Login user
Navigate to Products page
Add multiple products to cart
View cart
Proceed to checkout
Enter payment details
Place order
Verify success message
🧾 Key Features
Page Object Model architecture
Reusable methods (BasePage)
TestNG grouping (e.g. requiresLogin)
Dynamic test data support
Multiple product cart handling
🐞 Common Issues & Fixes
ElementNotInteractableException

✔ Solution: use explicit waits

NoSuchElementException

✔ Ensure correct page navigation before assertion

TimeoutException

✔ Increase wait or check UI state (modal/popups)

📌 Test Execution Groups
@Test(groups = "requiresLogin")

Used for:

Purchase tests
Cart tests
👤 Author

Automation Framework by: Eman Essam
