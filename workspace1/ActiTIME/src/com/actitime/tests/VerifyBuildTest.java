package com.actitime.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.Loginpage;

public class VerifyBuildTest extends BaseTest 
{
	@Test
	public void verifythebuild()
	{
		String user= ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 0);
		String pass=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 1);
		String loginT=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 2);
		String ETT=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 3);
		String build=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 4);
		Loginpage lp = new Loginpage(driver);
		EnterTimeTrackPage ett = new EnterTimeTrackPage(driver);
		lp.verifypage(loginT);
		lp.enterusername(user);
		lp.enterpassword(pass);
		lp.clickonlogin();
		lp.verifypage(ETT);
		ett.clickonhelp();
		ett.clickonabout();
		ett.verifybuild(build);
		
	}

}
