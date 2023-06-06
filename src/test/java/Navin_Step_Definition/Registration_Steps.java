package Navin_Step_Definition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_Steps {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
		System.out.println("user navigates on registration page");
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	    List<List<String>> userlist = dataTable.asList(String.class);
	    
	    for(List<String> e:userlist) {
	    	System.out.println(e);
	    }
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("user registration shpuld be successful");
	}

}
