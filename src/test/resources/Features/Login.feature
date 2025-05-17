Feature: Login Feature

  Scenario Outline: Login with valid data
    Given user in home page
    And user clicked on signIn signUp
    And user redirected to login page
    When user enters "<name>" and "<email>"
    And user clicked on login button
    Then user login successfully
    Examples:
      | name | email |
      | Nariman    | narimanfarag85@gmail.com |
      | user     | narimanfarag25@gmail.com   |


  Scenario Outline: Login with invalid data
    Given user in home page
    And user clicked on signIn signUp
    And user redirected to login page
    When user enters "<name>" and "<email>"
    And user clicked on login button
    Then error message will appear
    Examples:
      | name | email |
      | Nariman  | narimanfarag81@gmail.com |
      | user     | narimanfarag22@gmail.com   |