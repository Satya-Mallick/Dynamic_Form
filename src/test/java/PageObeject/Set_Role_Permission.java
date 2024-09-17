package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class Set_Role_Permission extends Utility {
	public WebDriver driver;
	
	//Declaration of object by locators

	@FindBy(xpath = "//a[contains(text(),'Set Role Permission')]")
	protected WebElement SetRolePermission;
	
	@FindBy(id = "selPermissionFor")
	protected WebElement selPermissionFor;
	
	@FindBy(id = "selSelectRole")
	protected WebElement selSelectRole;  
	
	@FindBy(id = "selSelectUser")
	protected WebElement selSelectUser;
	
  //@FindBy(xpath = "(//label[contains(text(),'Manage Forms')]/../../..//input[@id='chkSelectAll_1'])[1]")
	@FindBy(xpath = "//label[contains(text(),'Manage Forms')]/following::*[2]")
	protected WebElement ManageFormAsAdd;
	
	@FindBy(xpath = "//label[contains(text(),'Manage Forms')]/following::*[4]")
	protected WebElement ManageFormAsView;
	
	@FindBy(xpath = "//label[contains(text(),'Manage Forms')]/following::*[8]")
	protected WebElement ManageFormAsDelete;

	@FindBy(xpath = "//button[contains(text(), 'Submit') ]")
	protected WebElement srpSubmit;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	protected WebElement PoPup_Ok;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement PoPup_OK;
	
	//Initialization of object

		public Set_Role_Permission(WebDriver driver) {
			 {
				  this.driver=driver;
				  PageFactory.initElements(driver, this);
				  }
		}
		
   // Utilization all methods of the Manage_Department submit page

		 public void SetRolePermission() 
		  {
			    webdriverwaitvisibilityof(driver,SetRolePermission);
			    SetRolePermission.click();
			 }
		
		public void selPermissionFor(String Permission_For) 
		  {
			 webdriverwaitvisibilityof(driver,selPermissionFor); 
			 selPermissionFor.click();
			 selectbyvisibletext(selPermissionFor,Permission_For);
		  }  
//		 public void selSelectRole(String Permissions)
//		  {
//			 webdriverwaitvisibilityof(driver,selSelectRole); 
//			 selSelectRole.click();
//			 selectbyvisibletext(selSelectRole,Permissions);
//		  }
		 
        public void selSelectRole(String Permissions) 
	     
		    {
    	
    	 try{
	      if( selSelectRole .isDisplayed())
	    	  selSelectRole.click();
	          selectbyvisibletext(selSelectRole, Permissions);
		      System.out.println("click on popup Ok");
		    }
	     catch(Exception e)
    	    {
	    	 selSelectUser.click();
	    	 selectbyvisibletext(selSelectUser, Permissions);
    		 System.out.println("Execute the exception popup OK");
    	    }
		    }
		
		
		
		 public void ManageForm()
		  {
			webdriverwaitvisibilityof(driver,ManageFormAsAdd);
			ManageFormAsAdd.click();
			webdriverwaitvisibilityof(driver,ManageFormAsView); 
			ManageFormAsView.click();
			webdriverwaitvisibilityof(driver,ManageFormAsDelete);
			ManageFormAsDelete.click();
		  }
		 public void srpSubmit() {
		    webdriverwaitvisibilityof(driver,srpSubmit);
		    srpSubmit.click();
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
