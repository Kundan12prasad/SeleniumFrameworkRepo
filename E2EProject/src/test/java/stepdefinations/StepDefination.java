package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.pageobjects.LandingPage;
import org.pageobjects.LoginPage;

@RunWith(Cucumber.class)
public class StepDefination extends Base{
	

	@Given("^Initialize the Browser with Chrome$")
	public void initialize_the_Browser_with_Chrome() throws Throwable {
		driver = initializeDriver();	    
	}

	@Given("^Navigated to \"([^\"]*)\" size$")
	public void navigated_to_size(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@Given("^Click on login link in homepage and land to secure sign in page$")
	public void click_on_login_link_in_homepage_and_land_to_secure_sign_in_page() throws Throwable {
		LandingPage landingpage = new LandingPage(driver);
		if(landingpage.getPopUpSize().size()>0)
				{
			landingpage.getPopUp().click();
				}
		
		landingpage.getLogin().click();
	}

	/*@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(arg1);
		loginPage.getPassword().sendKeys(arg2);
		//System.out.println(text);		
		loginPage.getLogin().click();
	} */
	
	 @When("^User enter (.+) and (.+)$")
	    public void user_enter_and(String username, String password) throws Throwable {		 
		 LoginPage loginPage = new LoginPage(driver);
			loginPage.getEmail().sendKeys(username);
			loginPage.getPassword().sendKeys(password);
			//System.out.println(text);		
			loginPage.getLogin().click();	        
	    }

	@Then("^Verify the user is successfully logged in$")
	public void verify_the_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


    
    
        
    

}