Feature: Swag Labs Login

  Scenario: Login to Swag Labs with valid credentials
    Given User is on the Swag Labs login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the Login button
    Then User should see the Products page

  Scenario: Login to Swag Labs with invalid credentials
    Given User is on the Swag Labs login page
    When User enters username "locked_out_user" and password "secret_sauce"
    And User clicks on the Login button
    Then User should see the error message "Epic sadface: Sorry, this user has been locked out."

  Scenario: Add an item to the cart and view the cart
    Given User is on the Swag Labs login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the Login button
    And User adds the "Sauce Labs Bolt T-Shirt" item to the cart
    And User clicks on the cart icon
    Then User should see the "Sauce Labs Bolt T-Shirt" item in the cart


