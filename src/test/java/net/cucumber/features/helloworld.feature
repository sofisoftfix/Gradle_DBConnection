Feature: Hello World
  @skip_scenario
  Scenario: Say hello to the world

    When I say hello to the world
    Then I should see "Hello World"