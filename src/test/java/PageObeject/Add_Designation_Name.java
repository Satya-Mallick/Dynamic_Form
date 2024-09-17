package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;



public class Add_Designation_Name extends Utility {
	public WebDriver driver ;
	
	//Declaration of object by locators
	@FindBy(xpath = "//a[contains(text(),'Manage Designation')]")
	protected WebElement Manage_Designation;
	@FindBy(xpath = "//input[@formcontrolname='txtDesignationName']")
	protected WebElement add_designation;
	@FindBy(id="adname")
	protected WebElement add_designation_alias;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	protected WebElement Submit;
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	protected WebElement PoPup_Ok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement PoPup_OK;
	
	//Initialization of object

	public Add_Designation_Name(WebDriver driver) {
		 {
			  this.driver=driver;
			  PageFactory.initElements(driver, this);
			  }
	}
	
	// Utilization all methods of the grievance submit page
	
	 public void Manage_Designation() {
		    webdriverwaitvisibilityof(driver,Manage_Designation);
		    Manage_Designation.click();
		 }  
	 public void add_designation(String Designation_Name)
	  {
		webdriverwaitvisibilityof(driver,add_designation);
		add_designation.sendKeys(Designation_Name);
	  }
	 
	 public void add_designation_alias(String Alias_Name)
	  {
		webdriverwaitvisibilityof(driver,add_designation_alias);
		add_designation_alias.sendKeys(Alias_Name);
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
