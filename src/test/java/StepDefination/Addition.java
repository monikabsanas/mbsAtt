package StepDefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addition {

	@Given("User is on Addition page")
	public void user_is_on_addition_page() {
	    System.out.println(" Given");
	}

	@When("User Enter the firdt didgit")
	public void user_enter_the_firdt_didgit() {
	    System.out.println("First digit");
	}

	@When("User Enter the Second Digit")
	public void user_enter_the_second_digit() {
	    System.out.println("Second");
	}

	@Then("should display results")
	public void should_display_results() {
	    System.out.println("result");
	}
	
}
