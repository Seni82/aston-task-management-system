Feature: Ensure all fields are empty when clear method is called.
  #Check that when task is added as well fields are set to null.Feature:
  #Validate task without the appropriate fields input can not be added.Feature:
  # Validate task can be added onto the tree.Feature:
  # Validate task added are sorted based on importance and urgency.Feature:
  # Empty project name and fields

  Scenario Outline: Clear field function sets all fields to empty.
    Given I enter data into the application
    And I simulate '<nameOfButton>' action button by calling "events" added to button
    Then all data in field should be empty

    Examples:
            |nameOfButton|
            |   clear    |
            |   add      |