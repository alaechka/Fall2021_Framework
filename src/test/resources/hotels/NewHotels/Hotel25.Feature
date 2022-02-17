Feature: submit Feedback
  Scenario: Verify user can submit feedback after completing the feedback form
    When I launch hotels website
    And I click help button
    And I click Feedback button
    When I click star
    And I enter comment
    And I Select option for How likely are you to return
    And I Select answer for Prior to this visit, have you ever booked
    And I answer for 'Did you accomplish what you wanted to do on this page'
    Then I Verify “THANK YOU FOR YOUR FEEDBACK.“ is displayed

