package Navin_Step_Definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	}

	@Then("user is displyed login screen")
	public void user_is_displyed_login_screen() {
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String UserName) {
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String Password) {
	}

	@Then("user gets login failed error message")
	public void user_gets_login_failed_error_message() {
	}

}
