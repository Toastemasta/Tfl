Feature: Sign in

  @reg
  Scenario: To check for sign out and Edit buttons

   Given I entered a website "https://www.easyjet.com/en/"
    And I clicked the "accept cookie" button
    And I clicked the sign in button
    And I enter my e-mail address as "touksbee@yahoo.co.uk"
    And I enter my password as "password12"
    When I click the sign-in button
  # When I click the sign out button
  #Then I should see the "sign out"
  #And I should see the view button


