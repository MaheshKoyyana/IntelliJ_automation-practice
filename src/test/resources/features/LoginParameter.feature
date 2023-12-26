@loginparameter

Feature: WebDriver University - Validate Login Page

  Background:
    Given I access the webdriver university login page

  Scenario Outline: Validate - Successful & Unsuccessful login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with following login validation message <loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver1   | validation failed      |
      | joe_blogs | password1    | validation failed      |


