package Navin_Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Navin_Feature_File/Uber.feature"},
		glue = {"Navin_Step_Definition", "Navin_Hooks"},
		monochrome = true, tags = "@All",
		plugin = {"pretty", "junit:target/Cucumber_Test_Reports/report.xml"}
		)

public class Uber_Test_Runner_Class {

}
