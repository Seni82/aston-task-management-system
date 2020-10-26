Feature: Ensure validation stops task generation until form is filled


  @StepDefAnnotation
  Scenario: Ensure validation works.
    Given I attempt to add a new task
    When I simulate add action
    Then the new task is not created.