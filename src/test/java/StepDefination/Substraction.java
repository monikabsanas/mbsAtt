package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Substraction {
	@Given("User chhose minus action")
	public void user_chhose_minus_action() {
	    System.out.println("Gien");
	}

	@When("user Enter first number")
	public void user_enter_first_number() {
	    System.out.println("First number");
	}

	@When("Uset Enter the second Number")
	public void uset_enter_the_second_number() {
	    System.out.println("Second number");
	}

	@Then("user will see the result")
	public void user_will_see_the_result() {
	    System.out.println("Result");
	}


}
