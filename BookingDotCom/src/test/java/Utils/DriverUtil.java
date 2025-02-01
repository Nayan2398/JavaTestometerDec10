package Utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver;
import Driver.DriverFactory;

public class DriverUtil {
	
	private   WebDriver driver = null;
    
	private  JavascriptExecutor  jse =null ;
	
	private   WebDriverWait wait = null;
	
	public void launchSession(String url) {
		
		WebDriver driverParam =  DriverFactory.getDriverManager("chrome").getDriver();
		
		 Driver.getDriverInstance().setDriver(driverParam);
		 
		 jse = (JavascriptExecutor) driver;
		 
		 wait = new WebDriverWait(driver,Duration.ofSeconds(30)) ;
		 
		 driver =  Driver.getDriverInstance().getDriver();
		 
         driver.get(url);
		
         driver.manage().window().maximize();
         

	}
	
	public WebElement waitUntilElementToBeClickable (By locator) {
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		return element;
	}
	
	
	
   public  void scrollToElement(WebElement  element) {
	   
	   jse.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", element);
   }
	
   public void highLightElement(WebElement element) {
	   
	   jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
   }
   
 public void removeHighLightElement(WebElement element) {
	   
	   jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid White;');", element);
   }
   
   
    public void pause () {
    	
    	try {
    		TimeUnit.MILLISECONDS.sleep(2000);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }
    
    public void closeSession() {
    	
        Driver.getDriverInstance().closeDriver();
    }
   
}
