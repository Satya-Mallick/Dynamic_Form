@tag
Feature: Manage_Employee_Type
 
  @tag1
  @Login
  Scenario: Add employee type with valid data 
    Given User click the manage employee type link
    And User enter data in employee type field "<Employee_Type_Name>"
    And User enter data in employee type Alias Name field"<Alias_Name>"
    And User click on submit employee type button
    And User Validate the confirmation message
    Then User click on ok button of employee type confirmation message
    
       Examples: 
     |Employee_Type_Name|Alias_Name |
     |Permanent         | Pn        |
     
  @tag2
  @Login
  Scenario Outline: Add employee type with Invalid data 
  Given User click the manage employee type link
    And User enter data in employee type field "<Employee_Type_Name>"
    And User enter data in employee type Alias Name field"<Alias_Name>"
    And User click on submit employee type button
    And User Validate the invalid AddEmployeeType message
    Then User click on ok button of employee type invalid message
       Examples: 
     |Employee_Type_Name|Alias_Name |
     |P                 | Pm        |
     |                  | Pm        |
     |Permanent         | P         |
