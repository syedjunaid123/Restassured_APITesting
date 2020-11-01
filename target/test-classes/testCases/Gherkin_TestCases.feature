@tag
Feature: Validation on the API's

  @scenario1
  Scenario: Validating the employees details Call
    Given 
    When I have run the API of all Employees Details
    Then I validate the status code
    And I also validate that the profile Image Value is blank in all the fields

  @scenario2
  Scenario Outline: Validating the Individial employee Call
    Given 
    When I have run the API of the Individial employee
    Then I validate the status code
    And I also verify the Json Schema is matching the right response
    And Also verifying the String value of success  message 
