Feature: Open Bank Account

Scenario: Opening Bank Account With Nominee details
Given User should be at Account opening page
When User Enter the following data
| Monika | Sanas | Monika@gmail.com | 937865436 |
| Tejas | Gire | Tejs@gmail.com | 937860000 |
And user click on submit button
Then User account get created
