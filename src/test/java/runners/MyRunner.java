package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import com.hpe.alm.octane.OctaneCucumber;

@RunWith (OctaneCucumber.class)
@CucumberOptions(
		plugin = {"junit:reports/TestResult.xml",
				"html:reports/cucumber-html-report",
				"json:reports/cucumber.json",
				},
		//tags = {"@functional"},
		features = {"src/test/java/features"},
		glue = {"code_bindings"}
		)

public class MyRunner {

}