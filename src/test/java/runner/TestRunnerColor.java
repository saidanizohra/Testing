package runner;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.File;

@CucumberOptions(format = ("pretty"), glue = "Steps",
        features = {"src/test/java/features/PaletteCouleur.feature"},
        plugin = {
                "html:target/cucumber-html-report", "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/reportColor.html" },
        tags = {"@Couleur"})

@Test
public class TestRunnerColor extends AbstractTestNGCucumberTests{

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
    }

}
