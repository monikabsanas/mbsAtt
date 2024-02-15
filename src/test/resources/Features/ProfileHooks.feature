Feature: Profile Functionality

Scenario: Addition of Profile
Given I am at home page
When I click on add button
And I ente the data
Then profile should get added

Scenario: Updating the exixting profile
Given I am at home page
When I click on edit button
And I update the data
Then Prfole should get updated

Scenario: Deleting the profile
Given I am at home page
When I click on delete button
Then Profile should get deleted