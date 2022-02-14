Feature:hotels change dates button
  Scenario: Verify CHANGE DATES button is displayed at the end of search results
    When I launch hotels website
    When I click Search tab
    And I enter “bora” in destination
    And I Select “Bora Bora, Leeward Islands, French Polynesia” from auto suggestion
    When I click check in button
    And I click next button
    And I Select April 1, 2022 as Check-in
    And I select April 10 2022 as Check-out date
    And I click apply button locator
    When I click Search button
    Then I verify "Change dates" button is enabled
