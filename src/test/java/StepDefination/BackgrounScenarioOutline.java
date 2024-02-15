package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgrounScenarioOutline {
	@Given("User is at Login page")
	public void user_is_at_login_page() {
		System.out.println("user is at loggin page");
	    
	}

	@When("User Enter Username {string}")
	public void user_enter_username(String name) {
		
	    System.out.println("User enter the Usernam e: "+name);}

	@When("User Enter Pass {string}")
	public void user_enter_pass(String pass) {
	      System.out.println("User Enter te pass : "+pass);
	}

	@When("User Click on Login Button")
	public void user_click_on_login_button() {
	    
	}

	@Then("User should be at login")
	public void user_should_be_at_login() {
		System.out.println("login succefully");
	    
	}

}
