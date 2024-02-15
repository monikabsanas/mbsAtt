Feature: Login Functionality
Scenario: Login to application
Given I am at the login Page3
When I enter the credentials3
And I click on login button3
Then I should be able to login3

Scenario: validate title of page
Given I am at the login Page3
Then I should see title of page3
