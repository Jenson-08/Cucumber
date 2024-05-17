

  Feature: Application Login
    I want to login in the application
    @SmokeTest
  Scenario: Admin Page default login

    Given User is on Netbanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

    #Reusable
    @SmokeTest
    Scenario: User page default login
      Given User is on Netbanking landing page
      When User login into application with "user" and password "8332"
      Then Home Page is displayed
      And Cards are displayed

    @RegressionTest
    Scenario Outline: User page default login
      Given User is on Netbanking landing page
      When User login into application with "<Username>" and password "<Password>"
      Then Home Page is displayed
      And Cards are displayed

      Examples:
        | Username  | Password |
        | debituser | hello12  |
        | crediuser | lpo213   |


    Scenario:  User page default Sign up
      Given User is on Practice landing page
      When User signup into application
        | jenson            |
        | perez             |
        | jenpg10@gmail.com |
        | 85131166          |
      Then Home Page is displayed
      And Cards are displayed