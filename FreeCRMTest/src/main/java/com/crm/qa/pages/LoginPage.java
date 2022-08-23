package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase 
{
   //Page Factory-OR:
	
	@FindBy(xpath ="//input[@name=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement pwdElement;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtnElement;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement forgotPwdElement;
	
	@FindBy(xpath="//a[text()='Classic CRM']")
	WebElement classicCRM;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpElement;
	
   //Initializing the Page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
   //Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd)
	{
		username.sendKeys(un);
		pwdElement.sendKeys(pwd);
		loginBtnElement.click();
		
		return new HomePage();
	}
	public SignUp clickOnSignUpLink()
	{
		signUpElement.click();
		return new SignUp();
		
	}
	public ClassicCrm clickOnClassicCrmLink()
	{
		classicCRM.click();
		return new ClassicCrm();
	}
     
}
