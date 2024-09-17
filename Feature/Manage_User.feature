@tag
Feature: Manage_User
 
   @tag1
   @Login
   Scenario: Add User with valid data 
    Given User click the manage users link
    And User enter data in Full Name field "<Full_Name>"
    And User select data in Gender field "<Gender>"
    #And User upload photo
    And User enter Mobile Number"<MobileNumber>"
    And User enter Email Id"<Email_Id>"
    And User enter Alternate Mobile Number"<AlternateMobileNumber>"
    And User select Date Of Joining
    And User enter Address"<Address>"
    And User Role "<Role>"
    And User select Department"<Department>"
    And User select Designation"<Designation>"
    And User select Employee Type"<EmployeeType>"
    And User select Group"<Group>"
    And User select Hierarchy"<Hierarchy>"
    And User enter User Id "<UserId>"
    And User enter Password"<Password>"
    And User enter Confirm Password"<ConfirmPassword>" 
    And User click on submit user button
    And User Validate the confirmation message
    Then User click on ok button of user confirmation message
    @Logout
     Examples: 
     
      |Full_Name  |Gender|MobileNumber|Email_Id              |AlternateMobileNumber|Address          |Role  |Department|Designation     |EmployeeType|Group          |Hierarchy|UserId|Password |ConfirmPassword|                                                                        
      |Satya      |Male  |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      |
      
      
   @tag2
   @Login
  Scenario: Add User with invalid data 
    Given User click the manage users link
    And User enter data in Full Name field "<Full_Name>"
    And User select data in Gender field "<Gender>"
    #And User upload photo
    And User enter Mobile Number"<MobileNumber>"
    And User enter Email Id"<Email_Id>"
    And User enter Alternate Mobile Number"<AlternateMobileNumber>"
    And User select Date Of Joining
    And User enter Address"<Address>"
    And User Role "<Role>"
    And User select Department"<Department>"
    And User select Designation"<Designation>"
    And User select Employee Type"<EmployeeType>"
    And User select Group"<Group>"
    And User select Hierarchy"<Hierarchy>"
    And User enter User Id "<UserId>"
    And User enter Password"<Password>"
    And User enter Confirm Password"<ConfirmPassword>" 
    And User click on submit user button 
    And User Validate the invalid AddUser message
    Then User click on ok button of AddUser invalid message
    
    Examples: 
     
      |Full_Name  |Gender    |MobileNumber|Email_Id              |AlternateMobileNumber|Address          |Role  |Department|Designation     |EmployeeType|Group          |Hierarchy|UserId|Password |ConfirmPassword|                                                                        
      |S          |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      | 
      |           |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      | 
      |Satya      |--Select--|9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      |
      |Satya      |Male      |            |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      |     
      |Satya      |Male      |5555555555  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      |
      |Satya      |Male      |9337619187  |satyamallickgmail.com |8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      |
      |Satya      |Male      |9337619187  |                      |8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      |
      |Satya      |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |      |Admin@123|Admin@123      |
      |Satya      |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |123   |Admin@123|Admin@123      |
      |Satya      |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|Admin@123      |
      |Satya      |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |admin@123|Admin@123      |
      |Satya      |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |         |Admin@123      |
      |Satya      |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|admin@123      |
      |Satya      |Male      |9337619187  |satyamallick@gmail.com|8658290408           |A/37,ppl township|Tester|Testing   |Software Testing|Permanent   |Testing Warrior|ODISHA   |12345 |Admin@123|               |
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      