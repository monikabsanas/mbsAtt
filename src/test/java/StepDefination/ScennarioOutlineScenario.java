package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScennarioOutlineScenario {
	
	@Given("User at login page so")
	public void user_at_login_page_so() {
		System.out.println("User at login page");
	    
	}

	@When("User enter the username {string}")
	public void user_enter_the_username(String string) {
		
		System.out.println("Username is :" +string);
	  
	}

	@When("user Enter {int}")
	public void user_enter(Integer int1) {
	    System.out.println("Age is : " +int1);
	}

	@When("User Enter {string}")
	public void user_enter(String string) {
	    System.out.println("Gender is : " +string);
	}

	@Given("user should be at homepage")
	public void user_should_be_at_homepage() {
	    System.out.println("User is at home page");
	}

	@Then("User see the result")
	public void user_see_the_result() {
	   System.out.println("then is able to see the result");
	}


}
