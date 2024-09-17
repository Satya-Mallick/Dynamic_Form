package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class Add_Employee_Type extends Utility {
	public WebDriver driver;
	//Declaration of object by locators

	@FindBy(xpath = "//a[contains(text(),'Manage Employee Type')]")
	protected WebElement Manage_Employee_Type;
	@FindBy(xpath = "//input[@formcontrolname='txtEmployeeType']")
	protected WebElement add_employee_type;
	@FindBy(id="aempname")
	protected WebElement add_employee_type_alias;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	protected WebElement Submit;
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	protected WebElement PoPup_Ok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	protected WebElement PoPup_OK;
	//Initialization of object

		public Add_Employee_Type(WebDriver driver) {
			 {
				  this.driver=driver;
				  PageFactory.initElements(driver, this);
		     }
		}
		
		// Utilization all object of the Add employee type page
		public void Manage_Employee_Type() {
		    webdriverwaitvisibilityof(driver, Manage_Employee_Type);
		    Manage_Employee_Type.click();
		 }  
	 public void add_employee_type(String Employee_Type_Name)
	  {
		webdriverwaitvisibilityof(driver,add_employee_type);
		add_employee_type.sendKeys(Employee_Type_Name);
	  }
	 
	 public void add_employee_type_alias(String Alias_Name)
	  {
		webdriverwaitvisibilityof(driver,add_employee_type_alias);
		add_employee_type_alias.sendKeys(Alias_Name);
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
