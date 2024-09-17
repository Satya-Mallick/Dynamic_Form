package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class Add_Department_Name extends Utility {
public WebDriver driver;
//Declaration of object by locators

@FindBy(xpath = "//a[contains(text(),'Manage Department')]")
protected WebElement Manage_Department;
@FindBy(xpath = "//input[@formcontrolname='txtDepartmentName']")
protected WebElement add_department;
@FindBy(id="adeptname")
protected WebElement add_department_alias;
@FindBy(xpath = "//button[contains(text(),'Submit')]")
protected WebElement Submit;
@FindBy(xpath="//button[contains(text(),'Ok')]")
protected WebElement PoPup_Ok;
@FindBy(xpath="//button[contains(text(),'OK')]")
protected WebElement PoPup_OK;

//Initialization of object

public Add_Department_Name(WebDriver driver) {
	 {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
		  }
}

// Utilization all methods of the Manage_Department submit page

 public void Manage_Department() {
	    webdriverwaitvisibilityof(driver,Manage_Department);
	    Manage_Department.click();
	 }  
 public void add_department(String Designation_Name)
  {
	webdriverwaitvisibilityof(driver,add_department);
	add_department.sendKeys(Designation_Name);
  }
 
 public void add_department_alias(String Alias_Name)
  {
	webdriverwaitvisibilityof(driver,add_department_alias);
	add_department_alias.sendKeys(Alias_Name);
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
