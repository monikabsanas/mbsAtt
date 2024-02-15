Feature: Signup Functionality Background

  Background: 
    Given User is at Login page

  Scenario Outline: 
    When User Enter Username "<Username>"
    And User Enter Pass "<Pass>"
    And User Click on Login Button
    Then User should be at login

    Examples: 
      | Username | Pass       |
      | Monika   | Tejas@123  |
      | sanika   | sanika@123 |
