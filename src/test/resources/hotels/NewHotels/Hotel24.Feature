Feature: Empty feedback Form
  Scenario: Verify error is displayed when user submits the empty feedback form
    When I launch hotels website
    And I click help button
    And I click Feedback button
    And I click on submit button
    When I verify "Please fill in the required information highlighted below" is displayed
    Then I verify star boxes section is in a red dotted box