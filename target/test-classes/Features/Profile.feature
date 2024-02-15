Feature: Login by entering credentials
Scenario: Login with valid data
Given user at login page
When user enter the username as "testUser"
And user enter "Tes@123" as password
And User clcik on login button
Then User should be able to logged in