package Navin_Step_Definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_Search_Steps {
	
	@Given("I have a search field on Amazon Page")
	public void search_field_on_amazon_page() {
	    System.out.println("Step 1 - I'm on search page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void search_for_a_product_with_name_and_price(String productName, Integer Price) {
	    System.out.println("Step 2 - search the product" + productName + "Price" + Price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    System.out.println("Step 3 - Product" + productName + "is displayed");
	}

}
