Feature: Register
  @valid-register
  Scenario Outline: Register Account
    Given User on Home Page
    When User tap icon login
    And user click link register
    And  user input "<fullname>" on fullname field
    And  user input "<email>" field
    And  user input "<password>" On password field
    And  user tab button register
    Then android user on Altashop page
    Examples:
      |fullname|email|password|
      |Leni Cahyani|cahyani@gmail.com|123|
