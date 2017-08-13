
Feature: Virgin Trains

  @Virgin
  Scenario: Buying Ticket

    Given I entered a url
    And I entered "London Euston" in the Where from field
    And I entered "Manchester Piccadilly" in the Where to field
    And I entered  "09/08/2017" date field
    And I entered "08" in the hour field
    And I entered "45" in the minute field
    And I clicked return option
   # And I clicked the "+" button to increase adult by 1
    # And I clicked the other "+" button to increase children to 1
    # And I Clicked the Add Railcards button
    # And I entered "Annual Gold Card Railcard" railcard type field
    # When I clicked on the Go button
    # Then I should see the  "Help & contact" text
    # And I should see the  "Next up, choose a ticket" text
    # And I should see  the "Edit journey" hyperlink
