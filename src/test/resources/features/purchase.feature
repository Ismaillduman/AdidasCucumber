Feature: Adidas Order Placement Functionalities
  Agile Story: As a user, I should be able to place order from Website so that I can shop online

  Background:
    Given User is on the page
  Scenario: Placing a successful order
    When User adds "Sony vaio i5" from "Laptops"
    And User adds "Dell i7 8gb" from "Laptops"
    And User navigates to cart and removes "Dell i7 8gb"
    And user click on place order
    And user fills the form for order and clicks on purchase button
    Then Order id and order amount should be as expected
  @wip
Scenario: Verify all the products exist in the products pages
    Then Under "Phones" category User should be able to see the list of following products
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
      | Nexus 6           |
      | Samsung galaxy s7 |
      | Iphone 6 32gb     |
      | Sony xperia z5    |
      | HTC One M9        |


