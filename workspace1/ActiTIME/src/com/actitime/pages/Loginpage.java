package com.actitime.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generic.BasePage;
public class Loginpage extends BasePage {
	//declaration
	@FindBy(id="username")
	private WebElement U;
	@FindBy(name="pwd")
	private WebElement P;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement L;
	@FindBy(xpath="//nobr[contains(.,'actiTIME 2')]")
	private WebElement version;
     //initialization
	public Loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void enterusername(String un)
	{
		U.sendKeys(un);
	}
	public void enterpassword(String pwd)
	{
		P.sendKeys(pwd);
	}
	public void clickonlogin()
	{
		L.click();
	}
	public void verifypage(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public void verifyVersion()
	{
		verifyElement(version);
	}
}