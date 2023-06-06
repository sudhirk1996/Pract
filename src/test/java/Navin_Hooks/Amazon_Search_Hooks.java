package Navin_Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Amazon_Search_Hooks {
	
	@Before(order = 1)
	public void setup_Browser(Scenario sc) {
		System.out.println("Launch chrome browser");
		System.out.println(sc.getName());
	}
	
	@Before(order = 2)
	public void setup_Url() {
		System.out.println("Launch Url");
	}
	
	@After(order = 1)
	public void tearDown_Logout() {
		System.out.println("Logout the application");
	}
	
	@After(order = 2)
	public void tearDown_Close() {
		System.out.println("Close the browser");
	}

}
