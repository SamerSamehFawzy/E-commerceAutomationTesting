@smoke
Feature: F08_wishList | guest user could add products to wishlist

  Scenario: guest user could add products to wishlist successfully
    When guest user click on wishlist button for any product
    Then product will be added to wishlist page