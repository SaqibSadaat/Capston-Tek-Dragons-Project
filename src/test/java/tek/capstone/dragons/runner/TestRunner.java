package tek.capstone.dragons.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

//@RunWith is JUnit Annotation
@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "",
		features = ("classpath:features"),
		glue = "tek.capstone.dragons",
		dryRun = true,
		plugin = {
				"pretty",
				"html:target/htmlReports/cucumber-prettly.html",
				"json:target/jsonReports/cucumber.json"
		},
		snippets = CAMELCASE,
		monochrome = true
		
		
		)

public class TestRunner {

}