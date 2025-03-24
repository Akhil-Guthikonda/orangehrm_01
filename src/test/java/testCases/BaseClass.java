package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pageObjectModel.orangehrmLoginPage;

public class BaseClass {

	public WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void LaunchBrowser(String os, String br) {
		
		switch(br.toLowerCase()) 
		{
		case"chrome" : driver=new ChromeDriver(); break;
		case"edge" : driver=new EdgeDriver(); break;
		//case"FireFox" : driver=new EdgeDriver(); break;
		default:System.out.println("invalid"); return;
		}
		//driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		orangehrmLoginPage OLP = new orangehrmLoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		OLP.UserName();
		OLP.Password();
		OLP.SubmitButton();
	}
	
	
	
	@AfterClass
	public void teardown() {
	
		driver.quit();
	}
	
}
