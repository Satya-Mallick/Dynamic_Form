package Annotation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class BrowserFactory 
{
	
	public  static WebDriver driver ;
	public  static WebDriver setup() throws InterruptedException, Exception, TesseractException
	{
		  
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		    driver.get("http://192.168.10.169/csmfream-work/#/admin");
		    Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id=\"userID\"]")).sendKeys("supAdmin");
			Thread.sleep(2500);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
			Thread.sleep(3000);
			String Text = new Tesseract().doOCR(driver.findElement(By.id("captchaImage")).getScreenshotAs(OutputType.FILE));
           try {
			char[] a = Text.toCharArray();
            String ab="";
            for (int i = 0; i < 6; i++) 
            {
            ab=ab+a[i];
			}
            driver.findElement(By.id("Captcha")).sendKeys(ab);
            System.out.println(Text);
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[@type='submit']")).click();
           }
           catch(NoSuchElementException e){
           
           }
           Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2500);
			
			try{if(driver.findElement(By.xpath("//div[.='You have logged in another system.Do you want to logout to access the portal?']")).isDisplayed()) {
				driver.findElement(By.xpath("//button[.='Yes']")).click();
				Thread.sleep(2500);
				driver.findElement(By.xpath("//input[@id=\"userID\"]")).sendKeys("supAdmin");
				Thread.sleep(2500);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin@123");
				Thread.sleep(20000);
				String Text1 = new Tesseract().doOCR(driver.findElement(By.id("captchaImage")).getScreenshotAs(OutputType.FILE));
	           try {
				char[] a = Text1.toCharArray();
	            String ab="";
	            for (int i = 0; i < 6; i++) 
	            {
	            ab=ab+a[i];
				}
	            driver.findElement(By.id("Captcha")).sendKeys(ab);
	            System.out.println(Text1);
				Thread.sleep(3000);
				//driver.findElement(By.xpath("//input[@type='submit']")).click();
				
	           }
	           catch(NoSuchElementException e){
	           
	           }
	           Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(2500);
				driver.findElement(By.xpath("//img[@alt='user']")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Admin Console")).click();
			}
			
			}catch(NoSuchElementException e )
			{
//				 driver.findElement(By.xpath("//img[@alt='user']")).click();
//					Thread.sleep(3000);
//					driver.findElement(By.linkText("Admin Console")).click();
//					System.out.println("Direct login successfully");	
			}
			
            driver.findElement(By.xpath("//img[@alt='user']")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Admin Console")).click();
			return driver;
	  }
	
	public  static WebDriver signout() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='user']")).click();
 		driver.findElement(By.linkText("Log Out")).click();
		return driver;
		
	}
	
	
  }


