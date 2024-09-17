package StepDefination;

import org.junit.Assert;
import org.mortbay.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Annotation.BrowserFactory;
import PageObeject.Add_Department_Name;
import PageObeject.Add_Designation_Name;
import PageObeject.Add_Employee_Type;
import PageObeject.Add_Groups_Name;
import PageObeject.Add_Role_Name;
import PageObeject.Add_User;
import PageObeject.LoginPage;
import PageObeject.Set_Role_Permission;
import Utils.Securitydata;
import Utils.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.TesseractException;

public class Stepdefination extends Utility implements Securitydata {
	public WebDriver driver;
	public LoginPage loginpg;
	public Add_Designation_Name AddDegName;
	public Add_Department_Name AddDeptName;
    public Add_Role_Name AddRoleName;
    public Add_Groups_Name AddGroupName;
    public Add_Employee_Type AddEmployeeType;
    public Add_User AddUser;
    public Set_Role_Permission SetRolePermission;
	public Utility utility;
	public Xls_AllMethods xl;
	
    @Before("@Login")
	public void login() throws TesseractException, Exception
	{
		Log.info("Login to the Dashboard");
		driver = BrowserFactory.setup();
		
	}
    
    @After("@Logout")
    public void logout() throws TesseractException, Exception
	{
		Log.info("Login to the Dashboard");
		driver = BrowserFactory.signout();
		
	}
    
    
    
	//Login scenario from "32 to 87" 
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();  
		Status.storeStatusTrue(true, FilePath.HELP_SHEETNAME, 2);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		 driver.get(url); 
		  driver.manage().window().maximize();
		}
	
	@When("User enter ID as {string} and Password as {string}")
	public void user_enter_id_as_and_password_as(String userid, String Pass) throws Exception {
		loginpg =new LoginPage(driver);
		loginpg.enterUserId(userid);
		loginpg.enterPassword(Pass);
	}

	@When("User click on login button")
	public void user_click_on_login_button() throws Exception {
	   loginpg.clickonLoginButton();
	}

	@Then("Page titel should be {string}")
	public void page_titel_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		Status.storeStatus(actualTitle, expectedTitle, FilePath.HELP_SHEETNAME, 3);
	  
	 if (actualTitle.equals(expectedTitle))
	 {
		 Assert.assertTrue(true);
		 }
	 else {
		 Assert.assertTrue(false);
	 }
	}
	@Then("User Validate the invalid message")
	public void user_validate_the_invalid_message()throws Exception  {
		
		{
			xl= new Xls_AllMethods("D:\\Admin\\Admin_Console.xlsx");
			Thread.sleep(5000);
		    String actualerror1 = driver.findElement(By.id("swal2-html-container")).getText();
		    driver.findElement(By.xpath("//button[.='OK']")).click();
		    String expectederror1 = "User Id Cannot be Blank!";    
		    String expectederror2 = "Password Cannot be Blank!";
		    
		    

	        if (actualerror1.equalsIgnoreCase(expectederror1) || actualerror1.equalsIgnoreCase(expectederror2) )
		    {
		    	System.out.println("Invalid testcase pass");
		    	if (actualerror1.equalsIgnoreCase(expectederror1)) {
		    		xl.setCellData("Admin", "Status", 4, "PASS");
				}else {
					xl.setCellData("Admin", "Status", 4, "FAIL");
				}
		    	if (actualerror1.equalsIgnoreCase(expectederror2)) {
		    		xl.setCellData("Admin", "Status", 5, "PASS");
				}else {
					xl.setCellData("Admin", "Status", 5, "FAIL");
				}
		    } 
		}
	}
	//Designation name add scenario (89 to 161)
	
	@Given("User click the manage designation link")
	public void user_click_the_manage_designation_link() {
		AddDegName=new Add_Designation_Name(driver); 
		AddDegName.Manage_Designation();
	}

	@Given("User enter data in Designation Name field {string}")
	public void user_enter_data_in_designation_name_field(String Designation_Name) {
	   AddDegName.add_designation( Designation_Name);
	}

	@Given("User enter data in Alias Name field{string}")
	public void user_enter_data_in_alias_name_field(String Alias_Name) {
	    AddDegName.add_designation_alias(Alias_Name);
	    
	}

	@Given("User click on submit button")
	public void user_click_on_submit_button() {
	  AddDegName.Submit();
	 }

	@Then("User click on ok button of confirmation message")
	public void user_click_on_ok_button_of_confirmation_message() throws Exception {
		Thread.sleep(5000);
	    AddDegName.PoPup_Ok();
	}

	@Then("User Validate the confirmation message")
	public void user_validate_the_confirmation_message() throws Exception { 
		Thread.sleep(3500);
    String actualerror1 = driver.findElement(By.id("swal2-html-container")).getText();
    
    String expectederror1 = "Record Inserted Successfully";
    String expectederror2 = "Designation Name already exist!";
    String expectederror3 = "Department Name already exist!";
    String expectederror4 = "Role Name already exist!";
    String expectederror5 = "Group Name already exist!";
    String expectederror6 = "Employee Type already exist!";
    if (actualerror1.equalsIgnoreCase(expectederror1) )
    {
    	System.out.println("Record Inserted with valid data :"+ actualerror1);
    	
    }
    else if(actualerror1.equalsIgnoreCase(expectederror2))
    {
    	System.out.println("Designation name is not created with valid data because it already exit :"+actualerror1);
    }
    else if(actualerror1.equalsIgnoreCase(expectederror3))
    {
    	System.out.println("Department name is not created with valid data because it already exit :"+actualerror1);
    }
    else if(actualerror1.equalsIgnoreCase(expectederror4))
    {
    	System.out.println("Role name is not created with valid data because it already exit :"+actualerror1);
    }
    else if(actualerror1.equalsIgnoreCase(expectederror5))
    {
    	System.out.println("Group name is not created with valid data because it already exit :"+actualerror1);
    }
    else if(actualerror1.equalsIgnoreCase(expectederror6))
    {
    	System.out.println("Employee type name is not created with valid data because it already exit :"+actualerror1);
    }
    else
    {
    	System.out.println("Record is not inserted due to some error ");
    }
	}
	@Then("User click on ok button of invalid message")
	public void user_click_on_ok_button_of_invalid_message() throws Exception {
		Thread.sleep(3000);
	    AddDegName.PoPup_OK();
	}

	@Then("User Validate the invalid AddDegName message")
	public void user_validate_the_invalid_AddDegName_lmessage() throws Exception {
		Thread.sleep(3500);
	    String actualerror1 = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
	  
	    String expectederror2 = "Designation Name Cannot be Blank!";
	    String expectederror1 = "Designation Name should not be less than 2 character(s)";
	    if (actualerror1.equalsIgnoreCase(expectederror2) ||actualerror1.equalsIgnoreCase(expectederror1) )
	    {
	    	System.out.println("Invalid testcase pass:"+ actualerror1);
	    	
	    }
	    else
	    {
	    	System.out.println(" Invalid testcase fail");
	    } 
	}
	//Add Department Name(163 to220 )
	@Given("User click the manage department link")
	public void user_click_the_manage_department_link() {
		AddDeptName=new Add_Department_Name(driver); 
		AddDeptName.Manage_Department();;
	}

	@Given("User enter data in department Name field {string}")
	public void user_enter_data_in_department_name_field(String Department_Name) {
		AddDeptName.add_department( Department_Name);
	}
	
	@Given("User enter data in department Alias Name field{string}")
	public void user_enter_data_in_department_alias_name_field(String Alias_Name) {
	   AddDeptName.add_department_alias(Alias_Name);
	}
	
	@Given("User click on submit button1")
	public void user_click_on_submit_button1() {
	  AddDeptName.Submit();
	 }
	
	@Then("User click on ok button of confirmation message1")
	public void user_click_on_ok_button_of_confirmation_message1() throws Exception {
		Thread.sleep(3000);
		AddDeptName.PoPup_Ok();
	}
	
	@Given("User Validate the invalid AddDeptName message")
	public void user_validate_the_invalid_add_dept_name_message() throws Exception {
		Thread.sleep(3500);
	    String actualerror1 = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
	  
	    String expectederror2 = "Department Name Cannot be Blank!";
	    String expectederror1 = "Department Name should not be less than 2 character(s)";
	    String expectederror3 = "Alias Name should not be less than 2 character(s)";
	    if (actualerror1.equalsIgnoreCase(expectederror2) ||actualerror1.equalsIgnoreCase(expectederror1)||actualerror1.equalsIgnoreCase(expectederror3) )
	    {
	    	System.out.println("Invalid testcase pass:"+ actualerror1);
	    	
	    }
	    else
	    {
	    	System.out.println(" Invalid testcase fail");
	    }  
	}
	@Then("User click on ok button of invalid message1")
	public void user_click_on_ok_button_of_invalid_message1() throws Exception {
		Thread.sleep(3000);
	    AddDeptName.PoPup_OK();
	}
	
	//Add role name(226 to 276 )
	
	@Given("User click the manage role link")
	public void user_click_the_manage_role_link() {
		AddRoleName=new Add_Role_Name(driver);
		AddRoleName.Manage_Role();
	}

	@Given("User enter data in Role Name field {string}")
	public void user_enter_data_in_role_name_field(String Role_Name) {
	   AddRoleName.add_role(Role_Name);
	}

	@Given("User enter data in role Alias Name field{string}")
	public void user_enter_data_in_role_alias_name_field(String Alias_Name) {
	   AddRoleName.add_role_alias(Alias_Name);
	}
	
	@Given("User click on submit role button")
	public void user_click_on_submit_role_button() {
	   AddRoleName.Submit();
	}

	@Then("User click on ok button of role confirmation message")
	public void user_click_on_ok_button_of_role_confirmation_message() throws Exception {
	   Thread.sleep(3000);
	   AddRoleName.PoPup_Ok();
	}

	@Given("User Validate the invalid AddRoleName message")
	public void user_validate_the_invalid_add_role_name_message() throws Exception {
		Thread.sleep(3500);
	    String actualerror1 = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
	  
	    String expectederror2 = "Role Name Cannot be Blank!";
	    String expectederror1 = "Role Name should not be less than 2 character(s)";
	    String expectederror3 = "Alias Name should not be less than 2 character(s)";
	    if (actualerror1.equalsIgnoreCase(expectederror2) ||actualerror1.equalsIgnoreCase(expectederror1)||actualerror1.equalsIgnoreCase(expectederror3) )
	    {
	    	System.out.println("Invalid testcase pass:"+ actualerror1);
	    	
	    }
	    else
	    {
	    	System.out.println(" Invalid testcase fail");
	    } 
	}

	@Then("User click on ok button of role invalid message")
	public void user_click_on_ok_button_of_role_invalid_message() throws Exception {
		Thread.sleep(3000);
	    AddRoleName.PoPup_OK();
	}
	
	//Add manage groups(280 to 342 )
	
	@Given("User click the manage groups link")
	public void user_click_the_manage_groups_link() throws Exception {
		Thread.sleep(2500);
		AddGroupName=new Add_Groups_Name(driver);
		AddGroupName.Manage_Groups();
	}

	@Given("User enter data in groups Name field {string}")
	public void user_enter_data_in_groups_name_field(String Groups_Name) throws Exception {
		Thread.sleep(2500);
	   AddGroupName.add_groups(Groups_Name);
	}

	@Given("User enter data in groups Alias Name field{string}")
	public void user_enter_data_in_groups_alias_name_field(String Alias_Name) {
	    AddGroupName.add_groups_alias(Alias_Name);
	}
	
	@Given("User click on submit groups button")
	public void user_click_on_submit_groups_button() {
	   AddGroupName.Submit();
	}

	@Then("User click on ok button of groups confirmation message")
	public void user_click_on_ok_button_of_groups_confirmation_message() {
	   AddGroupName.PoPup_Ok();
	}

	@Given("User Validate the invalid AddGroupsName message")
	public void user_validate_the_invalid_add_groups_name_message() throws Exception {
		Thread.sleep(3500);
	    String actualerror1 = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
	  
	    String expectederror2 = "Group Name Cannot be Blank!";
	    String expectederror1 = "Group Name should not be less than 2 character(s)";
	    String expectederror3 = "Alias Name should not be less than 2 character(s)";
	    if (actualerror1.equalsIgnoreCase(expectederror2) ||actualerror1.equalsIgnoreCase(expectederror1)||actualerror1.equalsIgnoreCase(expectederror3) )
	    {
	    	System.out.println("Invalid testcase pass:"+ actualerror1);
	    	
	    }
	    else
	    {
	    	System.out.println(" Invalid testcase fail");
	    }  
	}

	@Then("User click on ok button of groups invalid message")
	public void user_click_on_ok_button_of_groups_invalid_message() throws Exception {
		  Thread.sleep(3000);
		  AddGroupName.PoPup_OK();
	}

	//Add manage employee type (345 to 400 )
	@Given("User click the manage employee type link")
	public void user_click_the_manage_employee_type_link() {
	   AddEmployeeType=new Add_Employee_Type(driver);
	   AddEmployeeType.Manage_Employee_Type();
	}

	@Given("User enter data in employee type field {string}")
	public void user_enter_data_in_employee_type_field(String Employee_Type_Name) {
	   AddEmployeeType.add_employee_type(Employee_Type_Name);
	}

	@Given("User enter data in employee type Alias Name field{string}")
	public void user_enter_data_in_employee_type_alias_name_field(String Alias_Name) {
	   AddEmployeeType.add_employee_type_alias(Alias_Name);
	}

	@Given("User click on submit employee type button")
	public void user_click_on_submit_employee_type_button() {
	   AddEmployeeType.Submit();
	}

	@Then("User click on ok button of employee type confirmation message")
	public void user_click_on_ok_button_of_employee_type_confirmation_message() {
	   AddEmployeeType.PoPup_Ok();
	}

	@Given("User Validate the invalid AddEmployeeType message")
	public void user_validate_the_invalid_add_employee_type_message() throws Exception {
		Thread.sleep(3500);
	    String actualerror1 = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
	  
	    String expectederror2 = "Employee Type Cannot be Blank!";
	    String expectederror1 = "Employee Type should not be less than 2 character(s)";
	    String expectederror3 = "Alias Name should not be less than 2 character(s)";
	    if (actualerror1.equalsIgnoreCase(expectederror2) ||actualerror1.equalsIgnoreCase(expectederror1)||actualerror1.equalsIgnoreCase(expectederror3) )
	    {
	    	System.out.println("Invalid testcase pass:"+ actualerror1);
	    	
	    }
	    else
	    {
	    	System.out.println(" Invalid testcase fail");
	    }  
	}

	@Then("User click on ok button of employee type invalid message")
	public void user_click_on_ok_button_of_employee_type_invalid_message() {
	    AddEmployeeType.PoPup_OK();
	}

	//Manage users (404 to 542 )
	
	@Given("User click the manage users link")
	public void user_click_the_manage_users_link() {
	AddUser=new Add_User(driver);
	AddUser.Manage_User();
	}

	@Given("User enter data in Full Name field {string}")
	public void user_enter_data_in_full_name_field(String Full_Name) {
	AddUser.Enter_Full_Name(Full_Name);
	}

	@Given("User select data in Gender field {string}")
	public void user_select_data_in_gender_field(String Gender) {
	AddUser.Select_Gender(Gender);
	   	}
	
//	@Given("User upload photo")
//	public void user_upload_photo() throws Exception   {
//	  AddUser.fileUpload(Data);
//	}
	
	 @Given("User enter Mobile Number{string}")
	 public void user_enter_mobile_number(String MobileNumber) throws Exception {
	   AddUser.Enter_Mobile_No(MobileNumber); 
	 }

	

	 @Given("User enter Alternate Mobile Number{string}")
	 public void user_enter_alternate_mobile_number(String AlternateMobileNumber) {
	  AddUser.Enter_Alternate_Mobile_No(AlternateMobileNumber);  
	 }

	 @Given("User select Date Of Joining")
	 public void user_select_date_of_joining() throws Exception {
	  AddUser.Enter_DOJ(date);
	 }

	 @Given("User enter Address{string}")
	 public void user_enter_address(String Address) {
	   AddUser.Enter_User_Address(Address); 
	 }
	
	 @Given("User Role {string}")
	 public void user_role(String Role) {
	    AddUser.Select_Role(Role);
	 }

	 @Given("User select Department{string}")
	 public void user_select_department(String Department) {
	   AddUser.Select_Department(Department);
	 }

	 @Given("User select Designation{string}")
	 public void user_select_designation(String Designation) {
	  AddUser.Select_Designation(Designation);
	 }

	 @Given("User select Employee Type{string}")
	 public void user_select_employee_type(String EmployeeType) {
	  AddUser.Select_EmployeeType(EmployeeType);
	 }

	 @Given("User select Group{string}")
	 public void user_select_group(String Group) {
	 AddUser.Select_Group(Group);   
	 }

	 @Given("User select Hierarchy{string}")
	 public void user_select_hierarchy_odisha(String Hierarchy) {
	   AddUser.Select_Hierarchy(Hierarchy); 
	 }

	 @Given("User enter User Id {string}")
	 public void user_enter_user_id(String UserId) {
	   AddUser.Enter_UserID(UserId); 
	 }

	 @Given("User enter Password{string}")
	 public void user_enter_password_admin(String Password) {
	   AddUser.Enter_Password(Password);  
	 }

	 @Given("User enter Confirm Password{string}")
	 public void user_enter_confirm_password_admin(String ConfirmPassword) {
	   AddUser.Enter_Confirm_Password(ConfirmPassword);  
	 }
	
	 @Given("User enter Email Id{string}")
	 public void user_enter_email_id_email_id(String Email_Id)  {
	  AddUser.Enter_Email_ID(Email_Id);
	 }
	 
	 @Given("User click on submit user button")
	 public void user_click_on_submit_user_button() {
	    AddUser.Submit();
	 }

	 @Then("User click on ok button of user confirmation message")
		public void user_click_on_ok_button_of_user_confirmation_message() {
		   AddUser.PoPup_Ok();
		}
	 @Given("User Validate the invalid AddUser message")
	 public void user_validate_the_invalid_add_user_message() throws Exception {
		 Thread.sleep(3500);
		    String actualerror1 = driver.findElement(By.xpath("//div[@id='swal2-html-container']")).getText();
		  
		    String expectederror2 = "Group Name Cannot be Blank!";
		    String expectederror1 = "Full Name Cannot Be Blank!";
		    String expectederror3 = "Select Gender";
		    String expectederror4 = "Mobile No. Cannot Be Blank!";
		    String expectederror5 = "Please enter a valid mobile no.";
		    String expectederror6 = "Enter a valid Email Id";
		    String expectederror7 = "Email Id Cannot Be Blank!"; 
		    String expectederror8 = "User Id Cannot Be Blank!"; 
		    String expectederror9 = "User Id should not be less than 4 character(s)"; 
		    String expectederror10= "Please enter a valid password"; 
		    String expectederror11= "Password Cannot be Blank!"; 
		    String expectederror12= "The confirm password did not match"; 
		    String expectederror13= "Confirm Password Cannot Be Blank!"; 
		    String expectederror14= "User id already exist!"; 
		    
		    if (actualerror1.equalsIgnoreCase(expectederror2) ||actualerror1.equalsIgnoreCase(expectederror1)||actualerror1.equalsIgnoreCase(expectederror3)||actualerror1.equalsIgnoreCase(expectederror4)||actualerror1.equalsIgnoreCase(expectederror5)||actualerror1.equalsIgnoreCase(expectederror6)||actualerror1.equalsIgnoreCase(expectederror7)||actualerror1.equalsIgnoreCase(expectederror8)||actualerror1.equalsIgnoreCase(expectederror9)||actualerror1.equalsIgnoreCase(expectederror10)||actualerror1.equalsIgnoreCase(expectederror11)||actualerror1.equalsIgnoreCase(expectederror12)||actualerror1.equalsIgnoreCase(expectederror13)||actualerror1.equalsIgnoreCase(expectederror14) )
		    {
		    	System.out.println("Invalid testcase pass:"+ actualerror1);
		    	
		    }
		    else
		    {
		    	System.out.println(" Invalid testcase fail");
		    }    
	 }

	 @Then("User click on ok button of AddUser invalid message")
	 public void user_click_on_ok_button_of_add_user_invalid_message() throws Exception {
		 AddUser.PoPup_Ok();
		 
	 }
	
	 // Set Role Permission (546 to 577 )
	 
	 @Given("User click the Set Role Permission link")
	 public void user_click_the_set_role_permission_link() {
		 SetRolePermission = new Set_Role_Permission(driver);
		 SetRolePermission.SetRolePermission();
	 }

	 @Given("User select data from Permission For field {string}")
	 public void user_select_data_from_permission_for_field(String Permission_For) {
	    SetRolePermission.selPermissionFor(Permission_For);
	 }

	 @Given("User select data from Select User or Select Role field{string}")
	 public void user_select_data_from_select_user_or_select_role_field(String Permissions) {
	     SetRolePermission.selSelectRole(Permissions);
	 }

	 @Given("User give permission for manage form as\\(Add view delete)")
	 public void user_give_permission_for_manage_form_as_add_view_delete() {
	    SetRolePermission.ManageForm();
	 }
	 
	 @Given("User click on add role permission submit button")
	 public void user_click_on_add_role_permission_submit_button() {
	    SetRolePermission.srpSubmit();
	 }

	 @Then("User click on ok button of add role permission confirmation message")
	 public void user_click_on_ok_button_of_add_role_permission_confirmation_message() {
	   SetRolePermission.PoPup_Ok(); 
	 }

	//Manage links(581 to )
	 
	 @Given("User click the Manage link")
	 public void user_click_the_manage_link() {
	     
	 }

	 @Given("User select data from Menu Type field {string}")
	 public void user_select_data_from_menu_type_field(String string) {
	    
	 }

	 @Given("User select data from Parent Link field\"MIS Report\"")
	 public void user_select_data_from_parent_link_field_mis_report() {
	     
	 }

	 @Given("User select data from Link_Type field\"External\"")
	 public void user_select_data_from_link_type_field_external() {
	     
	 }

	 @Given("User enter data in the link name field {string}")
	 public void user_enter_data_in_the_link_name_field(String string) {
	   
	 }

	 @Given("User enter data in the URL field\"	https:\\/\\/www.facebook.com\"")
	 public void user_enter_data_in_the_url_field_https_www_facebook_com() {
	    
	 }

	 @Given("User select data from Window Status field\"Same\"")
	 public void user_select_data_from_window_status_field_same() {
	    
	 }
	 
	 @Given("User click on submit link button")
	 public void user_click_on_submit_link_button() {
	     
	 }
	 
	 @Then("User click on ok button of manage link confirmation message")
	 public void user_click_on_ok_button_of_manage_link_confirmation_message() {
	     
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}


