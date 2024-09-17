@tag
Feature: Manage_Designation
 
    
  @tag1
  @Login
  Scenario: Add designation with valid data 
    Given User click the manage designation link
   # And User enter data in Designation Name field "<Designation_Name>"
    And User enter data in Alias Name field"<Alias_Name>"
    And User click on submit button
    And User Validate the confirmation message
    Then User click on ok button of confirmation message
    
       Examples: 
     |Designation_Name |Alias_Name |
     |Software Testing | ST        |
     
  @tag2
  @Login
  Scenario Outline: Add designation with Invalid data 
  Given User click the manage designation link
    And User enter data in Designation Name field "<Designation_Name>"
    And User enter data in Alias Name field"<Alias_Name>"
    And User click on submit button
    And User Validate the invalid AddDegName message
    Then User click on ok button of invalid message
       Examples: 
     |Designation_Name |Alias_Name |
     |S                | ST        |
     |                 | ST        |


  |FullName |Gender|  MobileNumber |EmailId               |AlternateMobileNumber  |Address|Role  |Department|Designation     |EmployeeType |Group          |Hierarchy|UserId |Password |ConfirmPassword |SearchByDepartment  |SearchByDesignation  |SearchByRole  |ReportingAuthorities |
  |Satya    |Male  |9337619187     |satyamallick@gmail.com|8658290408             |A/37   |Tester|Testing   |Software Testing|Permanent    |Testing Warrior|ODISHA   |1627   |Satya@123|Satya@123       |Testing Department  |Software Tester      |Junior Tester |SATYA SUNDAR MALLICK | 
    
     
