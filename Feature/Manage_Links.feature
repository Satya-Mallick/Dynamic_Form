@tag
Feature: Manage_Links
 
  @tag1
  #@Login
  Scenario: Add a Global link with valid data 
  
    Given User click the Manage link
    And User select data from Menu Type field "<Menu_Type>"  
     And User select data from Parent Link field"<Parent_Link>"
    And User select data from Link_Type field"<Link_Type>"
    And User enter data in the link name field "Facebook"
    And User enter data in the URL field"	https://www.facebook.com"
    And User select data from Window Status field"<Window_Status>"
    And User click on submit link button
    And User Validate the confirmation message
    Then User click on ok button of manage link confirmation message
    
       Examples: 
     |Menu_Type    |Link_Type   |            |Window_Status|
     |Global  Link |            |            |             |
     |Global  Link |External    |            |Same         | 
     |Primary Link |Internal    |            |New          | 
  
  
  @tag2
  #@Login
  Scenario: Add a Primery link with valid data 
  
    Given User click the Manage link
    And User select data from Menu Type field "<Menu_Type>"  
     And User select data from Parent Link field"<Parent_Link>"
    And User select data from Link_Type field"<Link_Type>"
    And User enter data in the link name field "Facebook"
    And User enter data in the URL field"	https://www.facebook.com"
    And User select data from Window Status field"<Window_Status>"
    And User click on submit link button
    And User Validate the confirmation message
    Then User click on ok button of manage link confirmation message
    
       Examples: 
     |Menu_Type    |Parent_Link    |Link_Type   |Window_Status|
     |             |               |            |             |
     |Primary Link |MIS Report     |External    |Same         | 
     |Primary Link |MIS Report     |Internal    |New          | 
    

