@logIn


Feature: As a user I want to be able to login under different roles
  Background: common steps
    Given user is on the login page
  @smoke
  Scenario: Login as a librarian
    When user logs in as a "librarian"
    Then user should be see dashboard page
  @parametrized_test @student @smoke
  Scenario: Login as a student
    When user logs in as a "student"
    Then user should be see "Book Management" page

    @negative_login @student
    Scenario: Invalid password
      When user logs in with valid username "librarian13@library" and wrong password "9rf6"
      Then use verifies that "Sorry, Wrong Email or Password" message is displayed
  @negative_login @student
  Scenario:Invalid username
    When user logs in with valid username "guest@library" and wrong password "9rf6axdD"
    Then use verifies that "Sorry, Wrong Email or Password" message is displayed

  @negative_login @parametrized_test
  Scenario: Invalid password as a student
    When user logs in with valid username "librarian13@library" and wrong password "9rf6"
    Then use verifies that "Sorry, Wrong Email or Password" message is displayed
  @negative_login @parametrized_test
  Scenario:Invalid username as a student
    When user logs in with valid username "guest@library" and wrong password "9rf6axdD"
    Then use verifies that "Sorry, Wrong Email or Password" message is displayed
