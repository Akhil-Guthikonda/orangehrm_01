package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orangehrmLoginPage extends BasePage{

	public orangehrmLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	WebElement username;
	
	@FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active\"][@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"][@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]" )
	WebElement submit;
	
	public void UserName() {
		username.sendKeys("Admin");
	}
	public void Password() {
		password.sendKeys("admin123");
	}
	public void SubmitButton() {
		submit.click();
	}
}
