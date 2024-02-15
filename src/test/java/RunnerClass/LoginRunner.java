package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\Login.feature"},
		
		glue= {"StepDefination"}
		
		
		)
public class LoginRunner extends AbstractTestNGCucumberTests {

}
