package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		plugin = {"html:reports/cucumber-html-report",
				"json:reports/cucumber.json",
				"pretty", "junit:reports/TestResult.xml"},
		//tags = {"@functional"},
		features = {"src/test/java/features"},
		glue = {"code_bindings"}
		)

public class MyRunner {

}