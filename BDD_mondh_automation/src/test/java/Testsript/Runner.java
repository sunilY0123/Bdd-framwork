package Testsript;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		        features=".//Features/Login.feature",
                glue="step_Definition",
                monochrome = false,
                dryRun = false,
                plugin = {"pretty","html:target//report.html"})

public class Runner{

}

		
	





