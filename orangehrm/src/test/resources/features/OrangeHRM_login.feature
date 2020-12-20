@login
  Feature: Login
    Agile Story: As a user, I want to be able to login to the OrangeHRM site so that I can see OrangeHRM company logo Header on homepage
    Scenario: User has a valid credential and should be able to login to the OrangeHRM website
      Given User is on orangeHRM login page
      When User enters userName and password and clicks on Login button
      Then User should be navigated to the OrangeHRM homepage
      And User should be able to see OrangeHRM Open Source HR Management title
      And User should be able to see OrangeHRM company logo Header
