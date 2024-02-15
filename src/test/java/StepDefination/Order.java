package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order {
	@Given("user should be logged into the app")
	public void user_should_be_logged_into_the_app() {
		System.out.println("User logged into app");
	    
	}

	@When("User Click on the order button")
	public void user_click_on_the_order_button() {
		System.out.println("Clicking on order button");
	}

	@When("User clicks on Past Order button")
	public void user_clicks_on_past_order_button() {
		System.out.println("Clicking on past order button");
	    
	}

	@Then("User should be able to see Past order information")
	public void user_should_be_able_to_see_past_order_information() {
		System.out.println("Validate past order information");
	}

	@When("User clicks on current Order button")
	public void user_clicks_on_current_order_button() {
		System.out.println("Clicking on current order button");
	}

	@Then("User should be able to see Current order information")
	public void user_should_be_able_to_see_current_order_information() {
		System.out.println("Validate current order information");
	    
	}

	@When("User clicks on Cancelled Order button")
	public void user_clicks_on_cancelled_order_button() {
		System.out.println("Clicking on cancelled order button");
		throw new ArithmeticException();
	}

	@Then("User should be able to see Cancelled order information")
	public void user_should_be_able_to_see_cancelled_order_information() {
		System.out.println("Validate cancelled order information");
		
	}
	
	

}
