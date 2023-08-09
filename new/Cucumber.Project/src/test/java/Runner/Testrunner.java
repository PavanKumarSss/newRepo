package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\ec\\new\\Cucumber.Project\\CucuFeature\\cucu.feature", 
		glue = "StepDefinition", 
		//monochrome = true,
		plugin = {"html:reports/cu.html", "pretty" }
		)
public class Testrunner {

}
