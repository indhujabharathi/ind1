
  @tag1
  Feature: calculator
  Scenario: Add
    Given I enter 50 in calculator
   And I press Add
   And I enter 40 in calculator
   When I press Equal symbol
   Then Result 90 is Displayed

Scenario: Subtract
Given I enter 80 in calculator
   And I press sub
   And I enter 30 in calculator