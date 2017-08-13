   #Feature: TFL

   # @try
  # Scenario Outline: To plan a journey
    # Given I entered a URL "https://tfl.gov.uk/"
    # And I entered "<originStation>" in from field
    # And I entered "<destinationStation>" in to field
    # When I click the Plan my journey button
    # Then I should see "journey results" header text
    # And I should see "<originStation>" in from field
    # And i should see "<destinationStation>" in to field
    # And I should see edit "journey" hyperlink
    # And I should see "Travel Preference & accessibility"
    #And I should see "Edit Preferences" hyperlink
#    And I should see the current URL as https://tfl.gov.uk/plan-a-journey/results?IsAsync=true&JpType=publictransport&InputFrom

    # Examples:
      # | originStation     | destinationStation |
      # | Elephant & Castle | London Waterloo    |
#      | Waterloo          | Canary Wharf       |
#      | Canary Wharf      | Canada Water       |
#      | Farringdon        | Hammersmith        |
#      | Blackfriars       | Aldgate East       |




