Feature: Login functionality

Background: User is successfully LaunchedApplication
When user opens "Chrome" browser with exe as "J:\\FLIPKARTPROJECT\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user opens URL as "https://www.flipkart.com"

@SmokeTest
Scenario: Login functionality with valid credentials
When user click on cancel login window
When use move cursor to login
When user click on MyProfile
When user enter "7769959097" as a username
When user enter "jkhappythoughts@007" as a password
When user click on login button
Then Application show login successfully