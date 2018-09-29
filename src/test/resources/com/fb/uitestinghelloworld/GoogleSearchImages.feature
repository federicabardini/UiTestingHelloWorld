Feature: A simple Google images research

  Background:
    Given Google images home page

    Scenario: A simple Google images search verifying some results are displayed
      Given I typed "Funny cats" in the Google images search bar
      When I click on the Search button
      Then I get some cats images displayed as a result