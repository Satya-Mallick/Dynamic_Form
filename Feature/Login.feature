
@tag
Feature: Login Feature

  @tag1
  Scenario: Login with valid data 
   Given User launch chrome browser 
   When User open URL "http://192.168.10.169/csmfream-work/#/admin"
   And User enter ID as "supAdmin" and Password as "Admin@123"
   And User click on login button
   Then  Page titel should be "CSM Framework"

  @tag2
  Scenario Outline: Login with Invalid data 
    Given User launch chrome browser 
   When User open URL "http://192.168.10.169/csmfream-work/#/admin"
   And User enter ID as "<userid>" and Password as "<password>"
   And User click on login button
   Then User Validate the invalid message

    Examples: 
      | userid  | password  |
      |         | Admin@123 |
      |supAdmin |           |
