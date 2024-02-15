Feature: Signin Functionality with Scenario outline 
Scenario Outline: Validating Signup page
Given User at login page so
When User enter the username "<name>"
And user Enter <age>
And User Enter "<gender>"

Examples:
| name | age | gender |
|Monika | 23 | Female |
|Tejas | 27 | male |

Scenario: Verify Created user details
Given user should be at homepage
Then User see the result