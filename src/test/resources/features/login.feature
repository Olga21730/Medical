@test @test2
Feature: Login feature

  Scenario:Dash board page
    Given Dashboard should be displayed
    When User clicks the Login module



  Scenario Outline:Verify user login fail with invalid credentials
    Given user on the login page
    When user enter invalid "<mail>" and "<password>"
    And user click the login button
    Then verify "message" message should be display

    Examples:
      | mail               | password    |
      | user20@gmail.com   | Userpass123 |
      | user50@gmail.com   | Userpass123 |
      | user80@gmail.com   | Userpass123 |
      | user110@gmail.com  | Userpass123 |








