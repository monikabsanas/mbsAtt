package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\Login3SameGiven.feature"},
		
		glue = {"StepDefination"},
		
		publish=true
		
		
		)

public class LoginRunner3GivenSame extends AbstractTestNGCucumberTests{

}
