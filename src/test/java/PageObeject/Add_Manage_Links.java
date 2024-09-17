package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;

public class Add_Manage_Links extends Utility {

	   public WebDriver driver;
		//Declaration of object by locators

		@FindBy(xpath = "//a[contains(text(),'Manage Links')]") 
		protected WebElement Manage_Links;
		@FindBy(id = "selLinkType")
		protected WebElement Menu_Type;
		@FindBy(id="selParentLink")
		protected WebElement Parent_Link ;
		@FindBy(id="selLinkTypelist")
		protected WebElement Link_Type ;
		@FindBy(id="urlfield")
		protected WebElement URL;   
		@FindBy(xpath = "//a[contains(text(),'Window Status')]") 
		protected WebElement Window_Status;
		@FindBy(xpath = "//button[contains(text(),'Submit')]")
		protected WebElement Submit;
		@FindBy(xpath="//button[contains(text(),'Ok')]")
		protected WebElement PoPup_Ok;
		@FindBy(xpath="//button[contains(text(),'OK')]")
		protected WebElement PoPup_OK;
	
		//Initialization of object

		public Add_Manage_Links(WebDriver driver) {
			 {
				  this.driver=driver;
				  PageFactory.initElements(driver, this);
				  }
		}

		// Utilization all methods of the Manage_Department submit page

		 public void Manage_Links() {
			    webdriverwaitvisibilityof(driver,Manage_Links);
			    Manage_Links.click();
			 }  
		 public void Menu_Type(String Groups_Names)
		  {
			webdriverwaitvisibilityof(driver,Menu_Type);
			Menu_Type.sendKeys(Groups_Names);
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
