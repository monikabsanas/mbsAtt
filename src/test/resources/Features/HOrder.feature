Feature: Profile Functionality

Scenario: Addition of Profile
Given I am at home pageH
When I click on add buttonH
And I ente the dataH
Then profile should get addedH

Scenario: Updating the exixting profileH
Given I am at home pageH
When I click on edit buttonH
And I update the dataH
Then Prfole should get updatedH

Scenario: Deleting the profileH
Given I am at home pageH
When I click on delete buttonH
Then Profile should get deletedH