@Regression
Feature: Login into https://www.saucedemo.com/
  @Login1_Positive
  Scenario: Login into web using registered username and registered password
  Given User accessed the website url https://www.saucedemo.com/
  When User entered registered username
    And User entered registered password
    And User press login button
    Then User successfully login

  @Login2_Negative
  Scenario: Login into web using registered username and unregistered password
  Given User accessed the website url https://www.saucedemo.com/
  When User entered registered username
    And User entered unregistered password
    And User press login button
    Then User getting error message

  @Login3_Negative
  Scenario: Login into web using unregistered username and registered password
  Given User accessed the website url https://www.saucedemo.com/
  When User entered uregistered username
    And User entered registered password
    And User press login button
    Then User failed to login

