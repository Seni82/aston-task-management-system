Feature: Add Tasks

  Scenario: I want to verify task can be added
    Given I populate all required fields
    And I fire event to generate task
    When I check the taskArray object
    Then task should be added