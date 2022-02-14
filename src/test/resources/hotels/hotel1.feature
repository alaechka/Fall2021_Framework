Feature: Hotels calendar
  Scenario:Verify past date and back button on Current month's calendar is disabled
    When I launch hotels website
    When I click on check in calendar
    And I click on button "back"
    And I check are dates disabled
    Then I verify back button on current month is disabled