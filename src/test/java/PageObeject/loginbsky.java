package PageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginbsky {
	//Declaration of object by locators
	@FindBy(id = "name")
	protected WebElement userid;
	@FindBy(id="password")
	protected WebElement password;
	@FindBy(id="captcha")
	protected WebElement captcha;
	@FindBy(id="btnLogin")
	protected WebElement loginbutton;
	
	//Initialization of object through constructor
		WebDriver driver;
	    public loginbsky(WebDriver Driver)
		{
		this.driver=Driver;
		PageFactory.initElements(Driver, this);
		}
	    
	    
	  //Utilization of object or you can say function of object 
	    public void enterUserId(String id) {
	    	userid.sendKeys(id);
	    }
	    public void enterPassword(String pass) throws Exception {
	    	password.sendKeys(pass);
	    	Thread.sleep(15000);
	    }
	    public void clickonLoginButton() throws Exception {
	    	loginbutton.click();
	    	Thread.sleep(2000);	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
