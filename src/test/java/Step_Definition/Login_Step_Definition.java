package Step_Definition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import Base.Base_Class;
import Pages.Home_Page;
import Pages.Login_Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_Definition extends Base_Class {
	
	WebDriver driver;
	Login_Page lp;
	Home_Page hp;
	
	@Given("^User launch required brawser$")
	public void launchBrawser() {
		this.driver=super.initialization();		
	}
	
	
	@And("User opens portal {string}")
	public void openPortal(String url) {
		
		driver.get(url);
		
	}
	
	@When("^User add email \\\"(.*)\\\" & password \\\"(.*)\\\"$")
	public void addCredentials(String email,String pass) throws InterruptedException {
		
		this.lp=new Login_Page(driver);
		lp.addEmailId(email);
		lp.addPassword(pass);
		
	}
	
	@Then("^Login pagetitle capture by user$")
	public void capturePageTitle() {
		lp.gettitleOfTheLoginPage();
			
	}
	
	@And("^User hit the login button$")
	public void clickLoginButton() {
		lp.clickLoginButton();
		
	}
	
	
	@And("^Dashboard pagetitle capture by user$")
	public void dashboardPageTitleCaptured() throws InterruptedException {
		
		this.hp=new Home_Page(driver);
		hp.gettitleOfTheHomePage();	
	}
	
	@And("^User click the logout button$")
	public void clickLogoutButton() {
		
		hp.logout();
	
	}
	
	
	@When("^User add email & password$")
	public void dataTable(DataTable table) {
		this.lp=new Login_Page(driver);
		List<String> data=table.asList();
		
		lp.addEmailId(data.get(0));
		lp.addPassword(data.get(1));
		
		
	}


}
