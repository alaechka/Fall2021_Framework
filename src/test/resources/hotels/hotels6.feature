Feature: Hotels passwords,emails
  Scenario: Verify error message for invalid data in SignUp form
    When I launch hotels website
    And I click sign in button
    And I click on SignUp link
    When I click on email box
    And I enter this email
    When I verify error message is displayed
    When I enter this password
    And I verify password error is displayed
    When I enter password greater than 20
    And I verify error message is displayed for password greater than 20
    When I enter invalid first name
    And I verify first name error is displayed
    When I enter invalid second name
    Then I verify second name error is displayed

