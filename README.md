Simple amaysim Failed Purchase Automation
It uses Katalon Studio to test the 7-day mobile plan purchase flow on the Amaysim website.

📌 Project Goal
The goal of this test is to make sure that if a credit card payment fails, the website correctly shows an error message. This prevents a bug where failed payments were previously not being registered.

🚀 How to Run This Test
Since this project was built in Katalon Studio, follow these steps:

Download Katalon: Make sure you have Katalon Studio installed.

Open Project: * Open Katalon Studio.

Go to File > Open Project.

Select this folder from your computer.

Run the Test:

Open the Test Cases folder in the sidebar.

Double-click on the Purchase 7-Day Plan test.

Click the Run button (the Play icon) at the top.

📝 Test Steps
Navigate to https://www.amaysim.com.au/.

Choose the 7-day mobile plan.

Select New Number and Physical SIM.

Enter user details (Name: Test Test, Address: Bridge St, Sydney).

Use the test credit card: 4242 4242 4242 4242.

Verify that the "Payment Failed" error message appears.

⚙️ Configuration
You can run this test on different environments by changing the Global Variables inside the Profiles section in Katalon. By default, it is set to the Production website.

🛠 Tools Used
IDE: Katalon Studio

Language: Groovy/Java

Type: Web UI Automation
