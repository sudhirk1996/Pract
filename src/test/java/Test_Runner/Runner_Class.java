package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature/Login.feature"},
		glue = {"Step_Definition", "My_Hooks"},
		monochrome = true, 
		plugin = {"pretty", "html:target/cucumber-reports/report.html"}
		)

public class Runner_Class {
	
	

}
