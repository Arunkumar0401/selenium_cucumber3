package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "E://Automation//Automation_projects//selenium_cucumber3//src//test//java//stepdefenitions//StepDefenition.java",
                glue = "StepDefenition"
        )
public class TestRunner
{

}
