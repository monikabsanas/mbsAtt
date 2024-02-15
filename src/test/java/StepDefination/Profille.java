package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profille {
	
	@Given("user at login page")
	public void user_at_login_page() {
	    System.out.println("User is nav to login screen");
	}

	@When("user enter the username as {string}")
	public void user_enter_the_username_as(String uname) {
		System.out.println("User name is : "+uname);
	    
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String pass) {
	   System.out.println("Password is : "+pass);
	}

	@When("User clcik on login button")
	public void user_clcik_on_login_button() {
		System.out.println("user is clciking on Login button");
	    
	}

	@Then("User should be able to logged in")
	public void user_should_be_able_to_logged_in() {
		System.out.println("User is login into app");
	    
	}



}
