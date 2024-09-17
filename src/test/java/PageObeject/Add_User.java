package PageObeject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Securitydata;
import Utils.Utility;


public class Add_User extends Utility implements Securitydata{
	public WebDriver driver;
	
	//Declaration of object by locators
	
	@FindBy(xpath = "//a[contains(text(),'Manage Users')]")
	protected WebElement Manage_User;
	@FindBy(xpath = "//input[@formcontrolname='txtFullName']")
	protected WebElement Enter_Full_Name;
	@FindBy(id = "selGender")
	protected WebElement Select_Gender;
//    @FindBy(id = "filePhoto")
//	protected WebElement Upload_File;
	@FindBy(id="mobno")
	protected WebElement Enter_Mobile_No;
	@FindBy(id= "emailid")
	protected WebElement Enter_Email_ID;
	@FindBy(id = "alternatemobileno")
	protected WebElement Enter_Alternate_Mobile_No;
	@FindBy(xpath = "//input[@formcontrolname='txtDateOfJoining']")
	protected WebElement Enter_DOJ;
	@FindBy(id = "address")
	protected WebElement Enter_User_Address;
	@FindBy(id = "selRole")
	protected WebElement Select_Role;
	@FindBy(id ="selDepartment")
	protected WebElement Select_Department;
	@FindBy(id ="selDesignation")
	protected WebElement Select_Designation;
	@FindBy(id ="selEmployeeType")
	protected WebElement Select_EmployeeType; 
	@FindBy(id ="selGroup")
	protected WebElement Select_Group;
	@FindBy(id ="selHierarchy")
	protected WebElement Select_Hierarchy;
	@FindBy(xpath = "//input[@formcontrolname='txtUserId']")
	protected WebElement Enter_UserID;
	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	protected WebElement Enter_Password;
	@FindBy(xpath = "//input[@formcontrolname='txtConfirmPassword']")
	protected WebElement Enter_Confirm_Password;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	protected WebElement Submit;
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	protected WebElement PoPup_Ok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement PoPup_OK;
	
	//Initialization of object

		public Add_User(WebDriver driver) {
			 {
				  this.driver=driver;
				  PageFactory.initElements(driver, this);
				  }
		}

		// Utilization all methods of the Manage_Department submit page

		 public void Manage_User() 
		  {
			    webdriverwaitvisibilityof(driver,Manage_User);
			    Manage_User.click();
			 }  
		 public void Enter_Full_Name(String Full_Name)
		  {
			webdriverwaitvisibilityof(driver,Enter_Full_Name);
			Enter_Full_Name.sendKeys(Full_Name);
		  }
		 public void Select_Gender(String Gender) 
		  {
			 webdriverwaitvisibilityof(driver,Select_Gender); 
			 Select_Gender.click();
			 selectbyvisibletext(Select_Gender,Gender);
		  }
		 public void Enter_Mobile_No(String MobileNumber) throws Exception
		  {
			 Thread.sleep(1500); 
			 webdriverwaitvisibilityof(driver,Enter_Mobile_No);
			  Enter_Mobile_No.sendKeys(MobileNumber);
		  }
		 
//         public void fileUpload(String path) throws AWTException, Exception {
//        		 Thread.sleep(1000);
//            	 Upload_File.click();
//        		 StringSelection stringSelection = new StringSelection(path);
//        		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//        		 // native key strokes for CTRL, V and ENTER keys
//        		 Robot robot = new Robot();
//        		 robot.keyPress(KeyEvent.VK_CONTROL);
//        		 robot.keyPress(KeyEvent.VK_V);
//        		 robot.keyRelease(KeyEvent.VK_V);
//        		 robot.keyRelease(KeyEvent.VK_CONTROL);
//        		 robot.keyPress(KeyEvent.VK_ENTER);
//        		 robot.keyRelease(KeyEvent.VK_ENTER);
//        		 }
		

		 
		
		 public void Enter_Email_ID(String Email_Id) 
		  {
		      webdriverwaitvisibilityof(driver,Enter_Email_ID);
			  Enter_Email_ID.sendKeys(Email_Id);
		  }
		 
		 public void Enter_Alternate_Mobile_No(String AlternateMobileNumber)
		  {
			  webdriverwaitvisibilityof(driver,Enter_Alternate_Mobile_No);
			  Enter_Alternate_Mobile_No.sendKeys(AlternateMobileNumber);
		  }
		 
		 public void Enter_DOJ (String date) throws Exception 
		  {
			 Enter_DOJ.click();
            Thread.sleep(3000);
			 JavascriptExecutor jse = (JavascriptExecutor) driver;

			 jse.executeScript("document.getElementById('doj').value='"+ date +"'");

		  }
		 
//		 public void Enter_DOJ() throws Exception {
//			 webdriverwaitvisibilityof(driver,Enter_DOJ);
//			 Enter_DOJ.click();
//			 Thread.sleep(4000);
//			 SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
//				Date date = new Date();
//				String actualDate = format.format(date);
//			 JavascriptExecutor jse = (JavascriptExecutor) driver;
//			  jse.executeScript("document.getElementById('doj').value='"+ actualDate +"'"); 
//			 
		// }
		 
		 public void Enter_User_Address(String Address) 
		 {
			 webdriverwaitvisibilityof(driver,Enter_User_Address);
			 Enter_User_Address.sendKeys(Address);	
		 }
		 
		 public void Select_Role(String Role) 
		 {
			 webdriverwaitvisibilityof(driver,Select_Role);
			 Select_Role.click();
			 selectbyvisibletext(Select_Role, Role);
		 }
		 
		 public void Select_Department(String Department) 
		 {
			 webdriverwaitvisibilityof(driver,Select_Department);
			 Select_Department.click();
			 selectbyvisibletext(Select_Department, Department);
		 }
		 
		 public void Select_Designation(String Designation) 
		 {
			 webdriverwaitvisibilityof(driver,Select_Designation);
			 Select_Designation.click();
			 selectbyvisibletext(Select_Designation, Designation);
		 }
		 
		 public void Select_EmployeeType(String EmployeeType) 
		 {
			 webdriverwaitvisibilityof(driver,Select_EmployeeType);
			 Select_EmployeeType.click();
			 selectbyvisibletext(Select_EmployeeType, EmployeeType);
		 }
		 
		 public void Select_Group(String Group) 
		 {
			 webdriverwaitvisibilityof(driver,Select_Group);
			 Select_Group.click();
			 selectbyvisibletext(Select_Group, Group);
		 }
		 
		 public void Select_Hierarchy(String Hierarchy) 
		 {
			 webdriverwaitvisibilityof(driver,Select_Hierarchy);
			 Select_Hierarchy.click();
			 selectbyvisibletext(Select_Hierarchy, Hierarchy);
		 }
		 
		 public void Enter_UserID(String UserId) 
		 {
			 webdriverwaitvisibilityof(driver,Enter_UserID);
			 Enter_UserID.sendKeys(UserId);
			 
		 }
		 
		 public void Enter_Password(String Password) 
		 {
			 webdriverwaitvisibilityof(driver,Enter_Password);
			 Enter_Password.sendKeys(Password);
			 
		 }
		 
		 public void Enter_Confirm_Password(String ConfirmPassword) 
		 {
			 webdriverwaitvisibilityof(driver,Enter_Confirm_Password);
			 Enter_Confirm_Password.sendKeys(ConfirmPassword);
			 
		 }
		 
		 public void Submit() {
			    webdriverwaitvisibilityof(driver,Submit);
			    Submit.click();
			 }
         public void PoPup_Ok() 
	     {
    	try{
	      if( PoPup_Ok .isDisplayed())
		      PoPup_Ok.click();
		      System.out.println("click on popup Ok");
		    }
	     catch(Exception e)
    	    {
    		 PoPup_OK.click();
    		 System.out.println("Execute the exception popup OK");
    	    }
		 }

}

