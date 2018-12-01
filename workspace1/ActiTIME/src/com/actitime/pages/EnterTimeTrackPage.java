package com.actitime.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.actitime.generic.BasePage;
public class EnterTimeTrackPage extends BasePage {
	//declaration
		@FindBy(id="logoutLink")
		private WebElement logout;
		@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_support']/..//div[@class='popup_menu_label']")
		private WebElement help;
		@FindBy(xpath="//a[.='About your actiTIME']")
		private WebElement about;
		@FindBy(xpath="//tr[@class='productVersionInfo']/..//span[.='(build 40469)']")
		private WebElement buildNo;
		
		
		//initialization
		public EnterTimeTrackPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
		//utilization
		public void clickonlogout()
		{
			logout.click();
		}
		public void clickonhelp()
		{
			help.click();
		}
		public void clickonabout()
		{
			about.click();
		}
		public void verifybuild(String build)
		{
		Reporter.log(buildNo.getText(), true);	
		if(buildNo.getText().equals(build)){
			Reporter.log("build is same", true);
		}
		}
		
		
}
