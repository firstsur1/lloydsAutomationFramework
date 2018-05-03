package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests/BuyMacBookPro.feature",
		glue= {"stepDefinitions"},
		monochrome=true,
		strict=true,
		dryRun=false,
		format={"pretty" ,"html:target/cucumber" ,
            "json:target/cucumber.json" ,
            "junit:target/cucumber.xml"},
		tags= {}
		)
public class TestRunner {
}
