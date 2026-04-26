This project is a Selenium Web Automation Framework built using:

<ul> <li>Java</li> <li>Selenium WebDriver</li> <li>TestNG</li> <li>Page Object Model (POM)</li> <li>Maven</li> </ul>

It is designed to test an e-commerce web application covering:

<ul>
  <li>User Registration</li>
  <li>Login </li>
  <li>Logout</li> 
  <li>Select Products and Add to Cart</li>
  <li>Delete Product from cart</li>
  <li>Checkout </li>
  <li>Payment Flow</li> 
</ul>





## 🏗️ Framework Structure



```text



src
├── main
│   └── java
│       ├── base
│       │   ├── BasePage.java
│       │   ├── BaseTest.java
│       │
│       │
│       ├── utils
│       │   └── DriverManager.java
│       │
│       └── pages
│           ├── HomePage.java
│           ├── LoginSignupPage.java
│           ├── RegisterPage.java
│           ├── AccountCreatedPage.java
│           ├── ProductsPage.java
│           ├── CartPage.java
│           ├── PaymentPage.java
│           └── CheckoutPage.java
│
└── test
    └── java
        ├── tests
        │   ├── LoginTest.java
        │   ├── RegisterTest.java
        │   ├── PurchaseTest.java
        │   └── InvalidLogin.java
        └── testng.xml


```




⚙️ Setup Instructions
1. Prerequisites
Java JDK 11+
Maven
Chrome browser
IntelliJ IDEA / Eclipse
3. Clone Project
git clone <repository-url>
cd <project-folder>
