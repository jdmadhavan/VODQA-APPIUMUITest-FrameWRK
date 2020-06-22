Feature: Login Leaforg

Scenario: TC0001 Login with Valid Credentials
    Given the valid credentials username as rajkumar@testleaf.com and password as Leaf@123
    When the user clicked the login button
    Then validate its navigating to home page and validate the TestThis text isdisplaying
    