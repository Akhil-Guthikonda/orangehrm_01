package testCases;

import org.testng.annotations.Test;

import pageObjectModel.AdminPage;

public class TC_002_AdminPage extends BaseClass{

	@Test
	public void AdminPahe() {
	AdminPage Adminpage = new AdminPage(driver);
	Adminpage.Admin();
	
	}
}
