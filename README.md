**Simple amaysim Failed Purchase Automation**

It uses Katalon Studio to test the 7-day mobile plan purchase flow on the Amaysim website.


**Project Goal**

The goal of this test is to make sure that if a credit card payment fails, the website correctly shows an error message. This prevents a bug where failed payments were previously not being registered.


**How to Run**

Install Katalon Studio
Clone repository
Run on Katalon Studio


**Test Steps**

1. Navigate to https://www.amaysim.com.au/.
2. Choose the 7-day mobile plan.
3. Select New Number and Physical SIM.
4. Enter user details.
5. Use the test declined credit card.
6. Proceed with payment.
7. Verify that the "Payment Failed" error message appears.


**Configuration**

You can run this test on different environments by changing the Global Variables inside the Profiles section in Katalon. By default, it is set to the Production website.


**Tools Used**

IDE: Katalon Studio
Language: Groovy/Java
Type: Web UI Automation
