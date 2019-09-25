
  @tag1
  Feature: calculator
  Scenario: Enter the no
    Given I enter 50 in calculator
   And I press Add
   And I enter 40 in calculator
   When I press Equal symbol
   Then Result 90 is Displayed
