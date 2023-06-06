package Navin_Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Navin_Feature_File/Amazon_Search.feature"},
		glue = {"Navin_Step_Definition", "Navin_Hooks"},
		monochrome = true,
		plugin = {"pretty"}
		)

public class Amazon_Search_Test_Runner_Class {

}
