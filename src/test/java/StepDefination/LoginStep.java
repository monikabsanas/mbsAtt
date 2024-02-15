package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("I am at the login Page")
	
	public void navToLoginPage() {
		System.out.println("Navigating to login page");
	}
	
	@When("I enter the credentials") 
	public void clickOnLogin()
	{
	System.out.println("Clicking on login button");	
	}
	
	@When("I click on login button")
	public void enteringCredentials() {
		System.out.println("ENTERING CREDENTIALS");
	}
	
	@Then("I should be able to login")
	public void validateLogin() {
		System.out.println("Valudation Login button");
	}
}
 