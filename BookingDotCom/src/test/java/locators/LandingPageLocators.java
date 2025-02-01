package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utils.DriverUtil;

public class LandingPageLocators extends DriverUtil{
	
	private By popUp = By.xpath("//button[starts-with(@aria-label,'Dismiss')]");
	
	private By signIn = By.linkText("Sign in");
	
	public void closePopUp() {
		
		WebElement element = waitUntilElementToBeClickable(popUp);
		
	    scrollToElement(element);
	    
	    highLightElement(element);
	    
	    pause ();
	    
	    removeHighLightElement(element);
		 
	    pause();
	    
		element.click();
	}
	
	public void clickSignIn () {
		
		WebElement element = waitUntilElementToBeClickable(signIn);
		
        scrollToElement(element);
	    
	    highLightElement(element);
	    
	    pause ();
	    
	    removeHighLightElement(element);
		 
	    pause();
	    
		element. click();
	}

}
