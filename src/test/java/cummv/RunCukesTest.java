package cummv;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
		glue = "src.test.steps", 
		plugin = { "pretty" })
public class RunCukesTest {
}