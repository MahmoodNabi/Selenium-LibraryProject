@librarian

  Feature: As a librarian I should be able to change the status of the member
      Background: common steps
      Given user is on the login page
        @ActiveUsers
    Scenario: Change status Active users
      When user logs in as a "librarian"
      Then user should be see dashboard page
      And click a user module
      Then choose first active user and click edit user
      Then change user status to inactive
      And save changes
@InactiveUsers
    Scenario: Change status Inactive users
      When user logs in as a "librarian"
      Then user should be see dashboard page
      And click a user module
      Then select inactive users
      Then choose first inactive user and click edit user
      Then change user status to active
      And save changes
