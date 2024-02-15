package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2Steps {
@Given("I am at the login Page2")
	
	public void navToLoginPage() {
		System.out.println("Navigating to login page 1");
	}
	
	@When("I enter the credentials2") 
	public void clickOnLogin()
	{
	System.out.println("Clicking on login button 12");	
	}
	
	@When("I click on login button2")
	public void enteringCredentials() {
		System.out.println("ENTERING CREDENTIALS 2");
	}
	
	@Then("I should be able to login2")
	public void validateLogin() {
		System.out.println("Valudation Login button 2");
	}
	@Given("I am at the loginpage")
	public void navigatingToLoginPage()
	{
		System.out.println("Navigating to login page for title");
	}
	
	@Then("I should see title of page")
	public void validateTitle()
	{
		System.out.println("Validate title of page");
	}
	



}
