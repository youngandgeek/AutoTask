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


🏗️ Framework Structure
<ul>
  <li>src
    <ul>
      <li>main
        <ul>
          <li>java
           

            <ul>
              <li>base
                <ul>
                  <li>BasePage.java</li>
                  <li>BaseTest.java</li>
                </ul>
              </li>
</ul>
            <ul>
             <li>utils
               <ul>
       <li>DriverManager.java</li>
</ul>
             </li>
          
          </li>
              <li>pages
                <ul>
                  <li>HomePage.java</li>
                  <li>LoginSignupPage.java</li>
                  <li>RegisterPage.java</li>
                  <li>AccountCreatedPage.java</li>
                  <li>ProductsPage.java</li>
                  <li>CartPage.java</li>
                  <li>PaymentPage.java</li>
                <li>CheckoutPage.java</li>
                </ul>

              </li> 
            </ul>
          </li>
        </ul>
      </li>
      <li>test
        <ul>
          <li>java
            <ul>
              <li>tests
                <ul>
                  <li>LoginTest.java</li>
                  <li>RegisterTest.java</li>
                  <li>PurchaseTest.java</li>
                  <li>InvalidLogin</li>
                </ul>
              </li>
              <li>testng.xml
                
              </li>
            </ul>
          </li>
        </ul>
      </li>
    </ul>
  </li>
</ul>

⚙️ Setup Instructions
1. Prerequisites
Java JDK 11+
Maven
Chrome browser
IntelliJ IDEA / Eclipse
3. Clone Project
git clone <repository-url>
cd <project-folder>
