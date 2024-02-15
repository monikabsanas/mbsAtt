package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

  features = {"src\\test\\resources\\Features\\AccoutDetainsMap.feature"},
  glue = {""},
  publish= true,
  plugin = {"pretty"}

)
public class AccountDetainsRunner extends AbstractTestNGCucumberTests {

}
