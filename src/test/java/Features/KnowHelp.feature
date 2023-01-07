Feature: This feature would be used to verify the help that UK citizen get using checker Tool

  Background: Launch th browser
    Given I am UK citizen and open checker tool
    When I Accept the coockies
    And I click on Start button

  Scenario: putting my circumstances in the checker tool
    When I put my circumstances in the checker tool
    Then I should get the result of whether I will get help or not
