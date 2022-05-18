Feature: Login
  @valid-user
  Scenario: Login Account
    Given user on Home Page
    When user tap icon login
    And  user input "leni@gmail.com" on email field
    And  user input "123" on password field
    And  user tab button login
    Then android user on altashop page
