Feature: Login functionality

  Scenario Outline: Admin user can login into application successfully
    Given I am in the login page
    When  I put admin valid credentials <user> and <password>
    Then  The application go to home page
    Examples:
      |user|password|
      |"admin"|"root"|

  Scenario Outline: Admin user can not login into application with wrong password
    Given I am in the login page
    When  I put invalid credentials <user> and <password>
    Then  I could not login
    Examples:
      |user|password|
      |"admin"|"roott"|