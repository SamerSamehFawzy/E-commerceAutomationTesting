@smoke
Feature: F04_Search | users will be able to search for products with different parameters

  Scenario Outline: user could search using product name

    Given user click on search field
    When user search with product name <productName> and press enter
    Then user could find valid results

    Examples:
      | productName |
      | "apple" |


  Scenario Outline: user could search using sku

    Given user click on search field
    When user search with SKU <sku> and press enter
    Then user could find valid results

    Examples:

      | sku |
      | "AP_MBP_13" |
