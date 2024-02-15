package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileHooks {
	
	@Given("I am at home page")
	public void i_am_at_home_page() {
		System.out.println("Given Statement");
	}
	@When("I click on add button")
	public void i_click_on_add_button() {
	    System.out.println("Clicking on Add button");
	}
	@When("I ente the data")
	public void i_ente_the_data() {
		System.out.println("Entering the data");
	}
	@Then("profile should get added")
	public void profile_should_get_added() {
		System.out.println("Validating addition");
	}
	
	@When("I click on edit button")
	public void i_click_on_edit_button() {
	    System.out.println("User clicking on Edit button");
	}
	@When("I update the data")
	public void i_update_the_data() {
		System.out.println("updating the Data");
	}
	@Then("Prfole should get updated")
	public void prfole_should_get_updated() {
		System.out.println("Validating updation");
	}
	
	@When("I click on delete button")
	public void i_click_on_delete_button() {
		System.out.println("Clicking on Delete button");
	}
	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
		System.out.println("Validation the deletion");
	}
	
	
	
	
	/*
	@Given("I am at home page")
	public void i_am_at_home_page() {
	    System.out.println("Given Statement");
	}

	@When("I click on add button")
	public void i_click_on_add_button() {
		System.out.println("Clicking on Add button");
	}

	@When("I ente the data")
	public void i_ente_the_data() {
		System.out.println("Entering the data");
	}

	@Then("profile should get added")
	public void profile_should_get_added() {
	    System.out.println("Validating the profle Addition");
	}

	@When("I click on edit button")
	public void i_click_on_edit_button() {
	    System.out.println("Clicking on edit button");
	}

	@When("I update the data")
	public void i_update_the_data() {
	    System.out.println("Upadting the data");
	}

	@Then("Prfole should get updated")
	public void prfole_should_get_updated() {
	    
	}

	@When("I click on delete button")
	public void i_click_on_delete_button() {
	   System.out.println("Clicking on Delete button");
	}

	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
	    
		System.out.println("Validation the deletion");
		
	}*/

}
