package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
public class AccountDetainsMap {

	@Given("User is on Datatable page")
	public void user_is_on_datatable_page() {
	   System.out.println("Give Page");
	}

	@When("User Enter the below data")
	public void user_enter_the_below_data(DataTable dataTable) {
		
		List<Map<String, String>> dataList= dataTable.asMaps();
		
		String emailvalue= dataList.get(3).get("Email");
		
		System.out.println(emailvalue);
	    
	}

	
}
