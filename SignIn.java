package Automationtool;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn {

	public WebDriver driver;
	@BeforeTest
	 public void setUp() throws MalformedURLException 		 
		 {					
			    DesiredCapabilities capabilities = new DesiredCapabilities();	
				  capabilities.setCapability("deviceName","Nexus5");	  
				  capabilities.setCapability(CapabilityType.BROWSER_NAME,"Android");	  
				  capabilities.setCapability(CapabilityType.VERSION, "6.0.1");	  
				  capabilities.setCapability("platformName", "Android");
				  capabilities.setCapability("appPackage", "com.unify.robo");	 
				  capabilities.setCapability("appActivity", "com.unify.robo.activities.SplashScreen");
				  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	    
		 }
	 @Test
	 public void signin() throws InterruptedException	 
	 {
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.id("com.unify.robo:id/btnContinue")).click();
			driver.findElement(By.id("com.unify.robo:id/et_usertxt")).sendKeys("das@gmail.com");//jn
			//driver.navigate().back();
			driver.findElement(By.id("com.unify.robo:id/et_pwd")).sendKeys("Joi@123");
			driver.navigate().back();
			driver.findElement(By.id("com.unify.robo:id/signin_btn")).click();
			
			

}
}
