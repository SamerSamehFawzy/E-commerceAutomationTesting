@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario Outline: user could login with valid email and password
    Given user go to login page
    When user enter email <email> and password <password>
    And user click on log in button
    Then user will be logged in successfully


    Examples:
      | email | password |
      | "tester@example.com" | "123456789" |