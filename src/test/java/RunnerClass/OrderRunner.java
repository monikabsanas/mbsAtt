package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\Order.feature"},
		
		glue= {"StepDefination"},
		
		publish = true
		)


public class OrderRunner extends AbstractTestNGCucumberTests{

}
