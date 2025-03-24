package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
public WebDriver driver;
	
	public DashBoardPage (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@class=\"oxd-brand-banner\"]//img[@alt=\"client brand banner\"]")
	WebElement ohrmbrandlogo;
	
	public boolean OHRMBrandLogo() {
		{
			try{
				return(ohrmbrandlogo.isDisplayed());
			}
			catch(Exception e) {
				return false;
			}
		}
	}
}
