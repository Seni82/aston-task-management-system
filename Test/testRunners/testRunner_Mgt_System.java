package testRunners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features={"Test/Feature"}, glue={"Test/StepDefinitions"},format = { "pretty","html: cucumber-html-reports",
        "json: cucumber-html-reports/cucumber.json" },
        dryRun = false)
public class testRunner_Mgt_System {
}
