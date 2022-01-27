Feature:Checking the Login functionality of Hudl.com



  Scenario: Login Functionality validation
    Given User launch chrome browser
    When User Open Url "https://www.hudl.com/login"
    And User enter email as "wnazmul.cis@gmail.com" and password as "Sl137536a"
    And Click on Login button
    Then User should Logged in and see home page
    When User click logout
    Then page tittle should be"We power sports"
    And close the Browser

    Scenario Outline:
      Given User launch chrome browser
      When User Open Url "https://www.hudl.com/login"
      And User enter email as "<email>" and password as "<psw>"
      And Click on Login button
      Then User should Logged in and see home page
      When User click logout
      Then page tittle should be"We power sports"
      And close the Browser
      Examples:
        |email|psw|
        |wnazmul.cis@gmail.com |12233|



