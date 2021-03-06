package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination{

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        //code to launch the landing page
    	System.out.println("User is navigated to netbanking landing page");
    }      
    
    
    @When("^User log into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_log_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable 
    {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    /*@When("^User log into application with  username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_log_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
        System.out.println(arg2); 
        
    } */
    

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //populated home page after validation
    	System.out.println("User successfully logged in");
    }

    /*@And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        // cards validated after validation
    	System.out.println("cards validated and displayed");
    } */
    
    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }
    
    

}