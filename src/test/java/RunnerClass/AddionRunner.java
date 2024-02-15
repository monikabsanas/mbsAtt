package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\Addition.feature"},
		
		glue= {"StepDefination"}
		
		
		)
public class AddionRunner extends AbstractTestNGCucumberTests {

}
