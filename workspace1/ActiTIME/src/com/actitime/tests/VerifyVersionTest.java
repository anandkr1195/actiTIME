package com.actitime.tests;
import org.testng.annotations.Test;
import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.Loginpage;
public class VerifyVersionTest extends BaseTest
{
  @Test
  public void testverifyVersion()
  {
	  String loginT=ExcelData.getData("./data/input.xlsx", "Sheet1", 1, 2);
	  Loginpage lp = new Loginpage(driver);
	  lp.verifypage(loginT);
	  //verify version
	  lp.verifyVersion();
  }	
}