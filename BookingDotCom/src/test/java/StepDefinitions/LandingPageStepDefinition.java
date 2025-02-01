package StepDefinitions;

import io.cucumber.java.en.Given;
import locators.LandingPageLocators;

public class LandingPageStepDefinition {
	
	
	LandingPageLocators landingPage = new LandingPageLocators();
	
	@Given("^user is on landing page$")
	public void user_is_on_landing_page() {
		landingPage.launchSession("https://www.booking.com/");
		
	     landingPage.closePopUp();
		
		landingPage.clickSignIn();
		
		landingPage.closeSession();
		
		
		
	}

}
