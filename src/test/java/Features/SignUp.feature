Feature:
  Scenario: Ensure that customer should able to successfully login with valid credencial
    Given Customer at BestBuy Homepage
    And Customer click Account button
    And Customer click on Create Account
    And Customer enter the firstName
    And Customer enter the LastName
    And Customer enter their email
    And Customer enter their Password
    And Customer enter their confirm password
    And Customer enter their Telephone
    When customer click on create account button from sign up page