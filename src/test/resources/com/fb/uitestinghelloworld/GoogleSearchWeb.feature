Feature: Google Search Web


  Background:
    Given the Google home page

  Scenario: a simple Google search with positive results
    Given I typed "Che storia zia" in the search bar
    When I click on Search button
    Then Google displays some results

   Scenario: a simple Google search with no results
     Given I typed "2342394834895389472394723947294" in the search bar
     When I click on Search button
     Then Google displays no results

