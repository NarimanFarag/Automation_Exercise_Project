Feature: Home Feature

  Scenario Outline: Check Subscribe Button Functionality
    Given user in home page
    And User Scroll Down
    And User Check That Subscribe Button is Visible
    When Click on Subscribe Button
    And user enters "<email>"
    Then Success Message is Visible
    Examples:
      | email |
      |nariman6@gmail.com|

