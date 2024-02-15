package HooksOrder;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookOrder {
	
	@Before(order = 1)
	public void beforeHook1() {
		
		System.out.println("Before Hook1 is executing");
	}
	
	@Before(order =  2)
	public void beforeHook2() {
		
		System.out.println("Before Hook2 is executing");
	}
	
	@After(order = 1)
	public void afterHook1() {
		System.out.println("After Hook1 is executing ");
	}
	
	
	@After(order =2)
	public void afterHook2() {
		System.out.println("After Hook2 is executing ");
	}
	

}
