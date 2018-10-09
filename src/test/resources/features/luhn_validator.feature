Feature: Luhn Validator

  Luhn Validator validates numbers

  Scenario: Calling the API with a valid luhn number
    When Simon calls the validator with the number 49927398716
    Then it is deemed valid

  Scenario: Calling the API with an invalid luhn number
    When Simon calls the validator with the number 49927398715
    Then it is deemed invalid