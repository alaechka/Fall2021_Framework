Feature: hw4_1
  Background:
    Given I launch facebook website

  Scenario: Verify link "Find your locator and log in" is displayed
    When I enter '%^&&*()' as login email
    When I enter 'abcd@1234' as login password
    When I click on login button
    Then I verify link "Find your account and log in" is displayed

    Scenario: Information displayed with empty credentials
      When I click Messenger link
      When I click log in button
      When I verify link "Find your account and log in" is displayed
      When I verify "continue" button is displayed
      When I verify "continue" button is enabled
      Then I verify "Keep me signed in" checkbox is NOT selected

      Scenario: error is displayed when user sign up without gender
        When I click on Create New Account
        When I enter first name
        When I enter last name
        When I enter mobile number
        When I enter new password
        When I enter date of birth
        When I click on Sign Up
        Then I verify Please select gender error is displayed

        Scenario: verify current date is selected in dropdown
          When I click on Create New Account
          Then I check date is selected in dropdown is current date



