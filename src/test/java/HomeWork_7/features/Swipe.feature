Feature: Swipe

  Scenario: Go swipe page
    Given User is on Main page
    When User click swipe button
    Then User should see  message "Swipe horizontal"