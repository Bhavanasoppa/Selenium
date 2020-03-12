package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="C:\\845124\\Cucumber\\Feature\\MyTest.feature",
glue={"StepDefinition"})
public class Runner {
	
	

}
