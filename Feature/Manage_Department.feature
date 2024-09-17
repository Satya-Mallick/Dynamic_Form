@tag
Feature: Manage_Department
 
    
  @tag1
  @Login
  Scenario: Add department with valid data 
    Given User click the manage department link
    And User enter data in department Name field "<Department_Name>"
    And User enter data in department Alias Name field"<Alias_Name>"
    And User click on submit button1
    And User Validate the confirmation message
    Then User click on ok button of confirmation message1
    
       Examples: 
     |Department_Name|Alias_Name |
     | Testing       | TG        |
     
  @tag2
  @Login
  Scenario: Add department with Invalid data 
    Given User click the manage department link
    And User enter data in department Name field "<Department_Name>"
    And User enter data in department Alias Name field"<Alias_Name>"
    And User click on submit button1
    And User Validate the invalid AddDeptName message
    Then User click on ok button of invalid message1
       Examples: 
     |Department_Name|Alias_Name |
     |S              | ST        |
     |               | ST        |
     |Testng         | S         |