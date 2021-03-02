@LoginFeature @Sanity
Feature: LoginFeature
  Background:
  User navigates to amazon
    Given I am on Facebook login page

  @Test1
  Scenario Outline: Verify login fails with incorrect credentials
    When I enter username as <username>
    And I enter password as <password>
    Then Login should fail
    And this is a test
    Examples:
      | username        | password |
      | "tom@gmail.com" | "jerry"  |