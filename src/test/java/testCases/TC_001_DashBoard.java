package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.DashBoardPage;

public class TC_001_DashBoard extends  BaseClass{

	@Test
	public void dashboardpage() {
		
		DashBoardPage DBP = new DashBoardPage(driver);
		boolean dashboardlogo = DBP.OHRMBrandLogo();
		Assert.assertEquals(dashboardlogo, true, "Logo failed");
	}
	
	
	
}
