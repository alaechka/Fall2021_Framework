Feature: Correct Data
  Scenario:  Verify tick-mark when user enters correct data in SignUp form
    When I launch hotels website
    And I click sign in button
    And I click on SignUp link
    When I click on email box
    And I enter my email
    And I verify tick-mark is displayed
    When I enter my password
    And I verify password tick-mark is displayed
    When I enter valid first name
    And I verify first name tick-mark is displayed
    When I enter valid second name
    Then I verify second name tick-mark is displayed
