Feature: Why book with hotels
  Scenario: Verify text/link on "Why book with Hotels.com?" section
    When I launch hotels website
    And I verify Free cancellation is displayed
    And I verify Our price guarantee link is displayed
    And I verify Get a reward night is displayed
    When I click on Our price guarantee link
    And I going back to 'Why book' section
    Then I Click on  Get a reward night link
    And I verify 'Instant savings.Reward..' displayed