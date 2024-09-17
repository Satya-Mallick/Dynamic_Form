@tag
Feature: Manage_Role
 
  @tag1
  @Login
  Scenario: Add role with valid data 
    Given User click the manage role link
    And User enter data in Role Name field "<Role_Name>"
    And User enter data in role Alias Name field"<Alias_Name>"
    And User click on submit role button
    And User Validate the confirmation message
    Then User click on ok button of role confirmation message
    
       Examples: 
     |Role_Name |Alias_Name |
     |Tester    | Tr        |
     
  @tag2
  @Login
  Scenario Outline: Add role with Invalid data 
  Given User click the manage role link
    And User enter data in Role Name field "<Role_Name>"
    And User enter data in role Alias Name field"<Alias_Name>"
    And User click on submit role button
    And User Validate the invalid AddRoleName message
    Then User click on ok button of role invalid message
       Examples: 
     |Role_Name |Alias_Name |
     |A         | ST        |
     |          | ST        |
     |Tester    | B         |
