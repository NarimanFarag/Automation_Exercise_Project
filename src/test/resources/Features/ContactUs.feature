Feature: ContactUs Feature

  Scenario Outline: Check Functionality of ContactUs
    Given user in home page
    When Click On ContactUs
    And ContactUs Page Is Visible
    And Fill Data "<Name>" , "<Email>", "<Subject>", "<Message>", "<Path>"
    And Click On Submit Button
    And Handle Alerts
    Then Success Message is Visible
    And Click On Home Button
    Examples:
      |Name | Email| Subject| Message| Path|
      |Nariman| nariman6@gmail.com|problem in search about product|there is a problem in | file:///C:/Users/Elasad/Downloads/BDD-with-Cucumber.pdf|