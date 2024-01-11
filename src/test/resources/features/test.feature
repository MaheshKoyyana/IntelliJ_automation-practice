Feature: WebDriver University - Login Page

@login2
Scenario: Validate Successful Login
When I enter a username webdriver
And I enter a password webdriver123
And I click on the login button
Then I should be presented with the successful login message
