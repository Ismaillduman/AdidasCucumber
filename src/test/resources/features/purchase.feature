Feature: Adidas Order Placement Functionalities
  Agile Story: As a user, I should be able to place order from Website so that I can shop online

  Background:
    Given User is on the page

  @wip
  Scenario: Placing a successful order

    When User adds "Sony vaio i5" from "Laptops"
    And User adds "Dell i7 8gb" from "Laptops"
    And User navigates to cart and removes "Dell i7 8gb"
    And user click on place order
    And user fills the form for order and clicks on purchase button
    Then Order id and order amount should be as expected

