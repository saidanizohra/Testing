package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, format = {"json:target/cucumber.html"}, glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests {


}
