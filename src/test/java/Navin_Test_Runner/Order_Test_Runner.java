package Navin_Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Navin_Feature_File/Order.feature"},
		glue = {"Navin_Step_Definition"},
		monochrome = true,
		plugin = {"pretty"}
		)

public class Order_Test_Runner {

}
