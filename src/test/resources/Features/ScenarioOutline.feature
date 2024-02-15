Feature: Signup Functionality
Scenario Outline: Validating signup for multiple users
Given User at signup page
When user enter "<name>" inside the from
And User Enter age aas <age>
And User confiem the "<gender>" by checkbox
Then User account gets created

Examples:
| name | age | gender |
| MOnika | 27 | Female |
| Tejas | 27 | Male |
| Jasika | 4 | female |
| Raj | 8 | Male |
