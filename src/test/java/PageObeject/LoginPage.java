package PageObeject;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.sourceforge.tess4j.Tesseract;

public class LoginPage {
	String userId=null;
	// Declaration of object by locators
	@FindBy(xpath = "//input[@id='userID']")
	WebElement userid;
	@FindBy(xpath = "//input[@id='userPWD']")
	WebElement password;
	@FindBy(xpath = "//input[@placeholder='Captcha']")
	WebElement Entercaptcha;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtn;
	// Initialization of object through constructor
	WebDriver driver;

	public LoginPage(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(Driver, this);
	}

	// Utilization of object or you can say function of object
	public void enterUserId(String UserID) {
		this.userId=UserID;
		userid.sendKeys(UserID);
	}

	public void enterPassword(String Password) throws Exception {
		while (true) {
			if(userid.getAttribute("value").length()==0) {
				userid.sendKeys(userId);
			}
			password.sendKeys(Password);
			Thread.sleep(1000);
			String text = new Tesseract()
					.doOCR(driver.findElement(By.id("captchaImage")).getScreenshotAs(OutputType.FILE));
			System.out.println(text);
			if (text.length() > 6) {
				char[] a = text.toCharArray();
				text = "";
				for (int i = 0; i < 6; i++) {
					text = text + a[i];
				}
			}
			driver.findElement(By.id("Captcha")).sendKeys(text);
			Thread.sleep(1000);
			LoginBtn.click();
			Thread.sleep(1000);
			try {
				String msg = driver.findElement(By.id("swal2-html-container")).getText().trim();
				Thread.sleep(1000);
				if (msg.equalsIgnoreCase("Invalid Captcha")) {
					driver.findElement(By.xpath("//button[contains(@class,'swal2-confirm')]")).click();
					Thread.sleep(1000);
				} else {
					break;
				}
			} catch (Exception e) {
				Thread.sleep(1000);
				if(driver.getTitle().equalsIgnoreCase("CSM Framework"))
				break;
			}
		}
	}

	public void clickonLoginButton() throws Exception {
		// LoginBtn.click();
		Thread.sleep(2000);

	}
}
