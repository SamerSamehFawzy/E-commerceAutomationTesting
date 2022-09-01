@smoke
Feature: Register | users could register with new accounts


  Scenario Outline: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name <first> and last name <last>
    And user enter date of birth
    And user enter email <email>
    And user enter company Name
    And user enter password and confirm password
    And user click on register button
    Then user will be directed to registration page with message "Your registration completed"

    Examples:
      | first   | last    | email                |
      | "Samer" | "Sameh" | "tester12@example.com" |

