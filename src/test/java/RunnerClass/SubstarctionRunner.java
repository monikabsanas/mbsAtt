package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\Substraction.feature"},
		
		glue= {"StepDefination"}
		
		
		)

public class SubstarctionRunner extends AbstractTestNGCucumberTests {

}
