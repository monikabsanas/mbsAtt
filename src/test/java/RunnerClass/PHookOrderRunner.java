package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\Features\\ProfileHooks.feature"},
		
		glue = {"StepDefination", "HookOrder"},
		
		plugin = {"pretty"},
		
		publish = true
		)

public class PHookOrderRunner extends AbstractTestNGCucumberTests{

}
