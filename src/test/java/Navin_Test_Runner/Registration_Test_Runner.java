package Navin_Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Navin_Feature_File/Registration.feature"},
		glue = {"Navin_Step_Definition"},
		monochrome = true, tags = "@All",
		plugin = {"pretty", "html:target/Cucumber_Test_Reports/report.html"}
		)

public class Registration_Test_Runner {
	
	

}
