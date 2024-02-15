package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features = {"src\\test\\resources\\Features\\ScenarioOutline.feature"},
		
		glue = {"StepDefination"},
		
		publish =true,
		plugin = {"pretty"}
		
		)
public class ScenarioOulineRunner extends AbstractTestNGCucumberTests{

}
