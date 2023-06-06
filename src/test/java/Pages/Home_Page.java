package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver hdriver;
	@FindBy(xpath = "//a[text()=\"Logout\"]") private WebElement logoutBtn;

public Home_Page(WebDriver driver) {
	this.hdriver=driver;		
	PageFactory.initElements(driver, this);		
	}

	public void logout() {
		logoutBtn.click();
	}

	public void gettitleOfTheHomePage() {
		System.out.println(hdriver.getTitle());
	}

}
