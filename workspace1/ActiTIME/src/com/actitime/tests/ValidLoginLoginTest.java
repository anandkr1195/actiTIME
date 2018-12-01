package com.actitime.tests;
import org.testng.annotations.Test;
import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.Loginpage;
public class ValidLoginLoginTest extends BaseTest{
	@Test
	public void testvalidLoginLogout()
	{
		String user= ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 0);
		String pass=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 1);
		String loginT=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 2);
		String ETT=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 3);
		
		Loginpage lp = new Loginpage(driver);
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		lp.verifypage(loginT);
		lp.enterusername(user);
		lp.enterpassword(pass);
		lp.clickonlogin();
		lp.verifyTitle(ETT);
		e.clickonlogout();
		lp.verifypage(loginT);
	}
}