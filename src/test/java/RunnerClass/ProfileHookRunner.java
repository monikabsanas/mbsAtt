package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\Features\\ProfileHooks.feature"},
		
		glue = {"StepDefination", "Hooks"},
		
		plugin = {"pretty"},
		
		publish = true
		)

public class ProfileHookRunner extends AbstractTestNGCucumberTests{

}
