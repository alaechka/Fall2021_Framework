Feature: login, password error
  Scenario: Verify Verification message for invalid sign in credentials
    When I launch hotels website
    When I click sign in button
    And I enter email
    And I enter password
    And I click on sign in button
    Then I verify Verification message is displayed

