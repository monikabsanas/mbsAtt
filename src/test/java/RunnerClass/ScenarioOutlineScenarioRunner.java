package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\ScenarioOutlineScenario.feature"},
		
		glue = {"StepDefination"}
		)
public class ScenarioOutlineScenarioRunner extends AbstractTestNGCucumberTests{

}
