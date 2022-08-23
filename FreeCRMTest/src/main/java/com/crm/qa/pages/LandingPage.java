package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase{
	
	//Page Factory-OR:
	@FindBy(xpath="//span[text()='Log In']")
	WebElement loginPageLinkElement;
	
	@FindBy(xpath = "//a[text()='About']")
	WebElement aboutPageLinkElement;
	
	@FindBy(xpath="//span[text()=' sign up']")
	WebElement signUpPageLinkElement;
	
	//Initializing the page object
	public LandingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public LoginPage clickOnLoginPageLink()
	{
		loginPageLinkElement.click();
		return new LoginPage();
		
	}
	
	public SignUp clickOnSignPageLink()
	{
		signUpPageLinkElement.click();
		return new SignUp();
	}
	
	
	
	

}
