package runner;

import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = {"stepDefinitions", "hooks"}, // Package where step definitions are
        plugin = {"pretty", "html:target/cucumber-reports"}// Report configuration

)
public class TestRunner extends AbstractTestNGCucumberTests {
    // No additional code needed here
}
