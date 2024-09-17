@tag
Feature: Set_Role_Permission
 
  @tag1
  @Login
  Scenario: Set Role Permission with valid data 
  
    Given User click the Set Role Permission link
    And User select data from Permission For field "<Permission_For>"
    And User select data from Select User or Select Role field"<Permissions>"
    And User give permission for manage form as(Add view delete)
    And User click on add role permission submit button
    And User Validate the confirmation message
    Then User click on ok button of add role permission confirmation message
    
       Examples: 
     |Permission_For|Permissions         |
     |Role          |Junior Tester       |
     |--Select--    |--Select--          |
     |Officer       |SATYA SUNDAR MALLICK|

