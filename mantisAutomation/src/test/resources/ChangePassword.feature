Feature: Change password

  Scenario: As a user I want to change my password
    Given I am logged in application
    When I click on my profile
    And I put my new password
    Then I see a message that my password was changed