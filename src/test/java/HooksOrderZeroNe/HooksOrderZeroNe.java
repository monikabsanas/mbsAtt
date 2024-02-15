package HooksOrderZeroNe;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksOrderZeroNe {
	
	@Before(order = 1)
	public void beforeHook1() {
		
		System.out.println("Before Hook1 is executing");
	}
	
	@Before(order =  -2)
	public void beforeHook2() {
		
		System.out.println("Before Hook-2 is executing");
	}
	@Before(order =  0)
	public void beforeHook0() {
		
		System.out.println("Before Hook0 is executing");
	}
	@After(order = 1)
	public void afterHook1() {
		System.out.println("After Hook1 is executing ");
	}
	
	
	@After(order =2)
	public void afterHook2() {
		System.out.println("After Hook2 is executing ");
	}
	
	@After(order =-5)
	public void afterHook5() {
		System.out.println("After Hook-5 is executing ");
	}
	


}
