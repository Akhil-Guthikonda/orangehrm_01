package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage{
public WebDriver drive;
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Admin']")
	WebElement admin;
	
	public void Admin() {
		admin.click();
	}
	
}
