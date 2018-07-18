Feature: HelloWorld
  Just a try
  Scenario: a simple Google search
    Given the Google home page
    When I type "Che storia zia" in the search bar
    Then Google displays some results