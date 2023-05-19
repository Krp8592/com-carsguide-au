Feature: Find the dealers and verify

  As a user I want to find the dealers

  @smoke @regression
  Scenario: Find the dealers and verify the dealers are in list
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Find a Dealer
    Then I navigate to "Find a Car Dealership Near You" page
    And I should see the dealer names <dealersName> are display on page

      | 3 point Motors Epping   |
      | 4WD Specialist Group    |
      | 5 Star Auto             |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY       |
      | ANDREA MOTORI SERVICE   |
      | Oxford Motors           |