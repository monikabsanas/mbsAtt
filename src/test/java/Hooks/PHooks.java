package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PHooks {

	@Before
	public void beforeHook() {
		
		System.out.println("Before Hook is executing");
	}
	
	@After
	public void afterHook() {
		System.out.println("After Hook is executing ");
	}
	
}
