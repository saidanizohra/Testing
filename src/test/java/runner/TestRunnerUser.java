package runner;





import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(format = ("pretty"), glue = "Steps",
        features = {"src/test/java/Features/AjoutUser1.feature"},
        plugin = {
                "html:target/cucumber-html-report", "json:target/cucumberUser.json",
                "junit:target/cucumber.xml",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/reportAddUser.html" },
        tags = {"@User"})

@Test
public class TestRunnerUser extends AbstractTestNGCucumberTests{

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
    }

}
