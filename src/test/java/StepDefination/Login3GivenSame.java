package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login3GivenSame {
	
@Given("I am at the login Page3")
	
	public void navToLoginPage() {
		System.out.println("Navigating to login page 33");
	}
	
	@When("I enter the credentials3") 
	public void clickOnLogin()
	{
	System.out.println("Clicking on login button 33");	
	}
	
	@When("I click on login button3")
	public void enteringCredentials() {
		System.out.println("ENTERING CREDENTIALS 33");
	}
	
	@Then("I should be able to login3")
	public void validateLogin() {
		System.out.println("Valudation Login button 33");
	}
//	@Given("I am at the loginpage")
//	public void navigatingToLoginPage()
//	{
//		System.out.println("Navigating to login page for title");
//	}
	
	@Then("I should see title of page3")
	public void validateTitle()
	{
		System.out.println("Validate title of page33");
	}

}
