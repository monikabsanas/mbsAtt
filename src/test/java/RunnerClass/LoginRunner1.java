package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features ={"src\\test\\resources\\Features\\Login2.feature"},
		
		glue = {"StepDefination"}
		
		)

public class LoginRunner1 extends AbstractTestNGCucumberTests {

}
