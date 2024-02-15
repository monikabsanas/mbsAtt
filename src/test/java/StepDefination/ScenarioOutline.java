package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {
	

@Given("User at signup page")
public void user_at_signup_page() {
   System.out.println("User at login page");
}

@When("user enter {string} inside the from")
public void user_enter_inside_the_from(String uname) {
   System.out.println("User name is : "+uname);
}

@When("User Enter age aas {int}")
public void user_enter_age_aas(int age) {
	
	System.out.println("Age is : "+age);
}    

@When("User confiem the {string} by checkbox")
public void user_confiem_the_by_checkbox(String gender) {
	System.out.println("gender is : "+gender);
    
}

@Then("User account gets created")
public void user_account_gets_created() {
	
   System.out.println("Accoount  created");
}

}
