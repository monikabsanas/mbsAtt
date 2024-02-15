package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\Features\\ProfileHooks.feature"},
		
		glue = {"StepDefination", "HooksOrder"},
		
		plugin = {"pretty"},
		
		publish = true
		)

public class HookOrderRunner extends AbstractTestNGCucumberTests {

}
