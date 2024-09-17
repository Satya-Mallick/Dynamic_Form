package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class Add_Groups_Name extends Utility {
	public WebDriver driver;
	//Declaration of object by locators

	@FindBy(xpath = "//a[contains(text(),'Manage Groups')]")
	protected WebElement Manage_Groups;
	@FindBy(xpath = "//input[@formcontrolname='txtGroupName']")
	protected WebElement add_groups;
	@FindBy(id="agname")
	protected WebElement add_groups_alias;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	protected WebElement Submit;
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	protected WebElement PoPup_Ok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement PoPup_OK;

	//Initialization of object

	public Add_Groups_Name(WebDriver driver) {
		 {
			  this.driver=driver;
			  PageFactory.initElements(driver, this);
			  }
	}

	// Utilization all methods of the Manage_Department submit page

	 public void Manage_Groups() {
		    webdriverwaitvisibilityof(driver,Manage_Groups);
		    Manage_Groups.click();
		 }  
	 public void add_groups(String Groups_Names)
	  {
		webdriverwaitvisibilityof(driver,add_groups);
		add_groups.sendKeys(Groups_Names);
	  }
	 
	 public void add_groups_alias(String Alias_Name)
	  {
		webdriverwaitvisibilityof(driver,add_groups_alias);
		add_groups_alias.sendKeys(Alias_Name);
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
