Feature: Order Functionality

Background:
Given user should be logged into the app
When User Click on the order button

Scenario: Fetching previously place order info

When User clicks on Past Order button
Then User should be able to see Past order information

Scenario: Fetching Currently place order info

When User clicks on current Order button
Then User should be able to see Current order information

Scenario: Fetching Cancelled order info

When User clicks on Cancelled Order button
Then User should be able to see Cancelled order information

