package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features\\BackgroundScenarioOutline.feature"},
		glue = {"StepDefination"}
		)

public class BackgrountScenarioOutlineRunner extends AbstractTestNGCucumberTests{

}
