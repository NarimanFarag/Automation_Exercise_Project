Feature: Login Feature

  Scenario: Login with valid data
    Given user in home page
    And user clicked on signIn signUp
    And user redirected to login page
    When user enter valid email
    And user enter valid password
    And user clicked on login button
    Then user login successfully