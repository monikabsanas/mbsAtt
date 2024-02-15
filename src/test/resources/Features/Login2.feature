Feature: Login Functionality
Scenario: Login to application
Given I am at the login Page2
When I enter the credentials2
And I click on login button2
Then I should be able to login2

Scenario: validate title of page
Given I am at the loginpage
Then I should see title of page
