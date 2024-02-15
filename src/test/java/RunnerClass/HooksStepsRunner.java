package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\Features\\ProfileHooks.feature"},
		
		glue = {"StepDefination", "HooksSteps"},
		
		plugin = {"pretty"},
		
		publish = true
		)
public class HooksStepsRunner extends AbstractTestNGCucumberTests{

}
