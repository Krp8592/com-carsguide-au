#Feature: Search Functionality
#
#  As a user I want to search cars with models
#
#  @smoke @regression
#  Scenario Outline: Search the buy car with model
#    Given I am on homepage
#    When I mouse hover on buy+sell tab
#    And I click search cars link
#    Then I verify navigation to "New & Used Car Search - carsguide" page
#    And I select make "<make>"
#    And I select model "<model>"
#    And I select location "<location>"
#    And I select price "<price>"
#    And I click on Find My Next Car tab
#    Then I verify the navigation on result page "<result>"
#    Examples:
#      | make       | model           | location           | price   | result  |
#      | Peugeot    | 308             | VIC - Melbourne    | $15,000 | Peugeot |
#      | Hyundai    | I30             | NSW - Central West | $7,500  | Hyundai |
#      | Kia        | Rio             | NSW - Sydney       | $15,000 | Kia     |
#      | Ford       | Fiesta          | QLD - Brisbane     | $20,000 | Ford    |
#      | Land Rover | Discovery Sport | SA - Adelaide      | $50,000 | Land    |
#      | Nissan     | Micra           | WA - Perth         | $15,000 | Nissan  |
#
#
#  @sanity @regression
#  Scenario Outline: Search the used car with model
#    Given I am on homepage
#    When I mouse hover on buy+sell tab
#    And I click Used link
#    Then I navigate to the used car page "Used Cars For Sale" page
#    And I select make on used car page "<make>"
#    And I select model on used car page "<model>"
#    And I select location on used car page "<location>"
#    And I select price on used car page "<price>"
#    And I click on Find My Next Car tab
#    Then I should see the make "<result>" in results
#    Examples:
#      | make    | model   | location               | price   | result  |
#      | Honda   | CR-V    | NSW - Sydney           | $10,000 | Honda   |
#      | Jeep    | Compass | NSW - Hunter           | $30,000 | Jeep    |
#      | Renault | Megane  | WA - Country East      | $15,000 | Renault |
#      | Toyota  | Prius   | VIC - Melbourne        | $20,000 | Toyota  |
#      | Nissan  | Pulsar  | NSW - Riverina         | $30,000 | Nissan  |
#      | Peugeot | 307     | VIC - Central Victoria | $25,000 | Peugeot |
