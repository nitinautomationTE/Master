package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	LandingPage landingPage;
	HomePage homePage;
	
	public  LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		landingPage = new LandingPage();
		landingPage.clickOnLoginPageLink();
		loginPage =new LoginPage();
	}
	@Test(priority=1)
	public void validateLoginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Cogmento CRM");
	}
	@Test(priority = 2)
	public void login() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("pwd"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
