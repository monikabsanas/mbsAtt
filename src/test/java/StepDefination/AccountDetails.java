package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import io.cucumber.datatable.DataTable;

public class AccountDetails {
	
	@Given("User should be at Account opening page")
	public void user_should_be_at_account_opening_page() {
	   System.out.println("User is at Account opeing page");
	}

	@When("User Enter the following data")
	public void user_enter_the_following_data(DataTable dataTable) {
	    
		 List<List<String>> data = dataTable.asLists();
		 
		 List<String> firtsList= data.get(0);
		 System.out.println(firtsList);
		 
		 String Fristtposition = firtsList.get(2);
		 System.out.println(Fristtposition);
		 
		 System.out.println("New Way \n \n");
		 
		 String Value = data.get(1).get(3);
		 System.out.println(Value);
		 
		 System.out.println("\nAnother new way");
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	    System.out.println("User click on Sunmit button");
	}

	@Then("User account get created")
	public void user_account_get_created() {
	    System.out.println("Account is created");
	}


}
