@tag
Feature: Manage_Groups
 
  @tag1
  @Login
  Scenario: Add groups with valid data 
    Given User click the manage groups link
    And User enter data in groups Name field "<Groups_Name>"
    And User enter data in groups Alias Name field"<Alias_Name>"
    And User click on submit groups button
    And User Validate the confirmation message
    Then User click on ok button of groups confirmation message
    
       Examples: 
     |Groups_Name     |Alias_Name |
     |Testing Warrior | Tw        |
     
  @tag2
  @Login
  Scenario Outline: Add groups with Invalid data 
  Given User click the manage groups link
    And User enter data in groups Name field "<Groups_Name>"
    And User enter data in groups Alias Name field"<Alias_Name>"
    And User click on submit groups button
    And User Validate the invalid AddGroupsName message
    Then User click on ok button of groups invalid message
       Examples: 
     |Groups_Name    |Alias_Name |
     | G             | Tw        |
     |               | Tw        |
     |Testing Warrior| T         |
