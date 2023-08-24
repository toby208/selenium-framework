@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then my account page is displayed




    Examples:
      | FirstName | LastName | Email                  | Password   | ConfirmPassword |
      | John      | Smith    | johnsmith4@testing.com | Testing12! | Testing12!      |


  @AccountLogin
  Scenario Outline: Registered customer to login with email and password
    Given I am on customer login page
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then my account page is displayed



    Examples:
      | Email                  | Password   |
      | johnsmith4@testing.com | Testing12! |





