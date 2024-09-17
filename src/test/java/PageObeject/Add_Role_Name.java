package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class Add_Role_Name extends Utility {
	public WebDriver driver;
	//Declaration of object by locators

	@FindBy(xpath = "//a[contains(text(),'Manage Role')]")
	protected WebElement Manage_Role;
	@FindBy(xpath = "//input[@formcontrolname='txtRoleName']")
	protected WebElement add_role;
	@FindBy(id="arolename")
	protected WebElement add_role_alias;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	protected WebElement Submit;
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	protected WebElement PoPup_Ok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement PoPup_OK;

	//Initialization of object

	public Add_Role_Name(WebDriver driver) {
		 {
			  this.driver=driver;
			  PageFactory.initElements(driver, this);
			  }
	}

	// Utilization all methods of the Manage_Department submit page

	 public void Manage_Role() {
		    webdriverwaitvisibilityof(driver,Manage_Role);
		    Manage_Role.click();
		 }  
	 public void add_role(String Role_Name)
	  {
		webdriverwaitvisibilityof(driver,add_role);
		add_role.sendKeys(Role_Name);
	  }
	 
	 public void add_role_alias(String Alias_Name)
	  {
		webdriverwaitvisibilityof(driver,add_role_alias);
		add_role_alias.sendKeys(Alias_Name);
	  }
	 public void Submit() {
	    webdriverwaitvisibilityof(driver,Submit);
	    Submit.click();
	 }
	 public void PoPup_Ok()
	 {
		 webdriverwaitvisibilityof(driver,PoPup_Ok );
		 PoPup_Ok.click();
	 }
	 public void PoPup_OK()
	 {
		 webdriverwaitvisibilityof(driver,PoPup_OK );
		 PoPup_OK.click();
	 }
}
