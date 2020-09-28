package com.xero.qa.test_cases;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xero.qa.base.TestBase;
import com.xero.qa.pages.HomePage;
import com.xero.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	//private static final String Title = null;
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
		}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new LoginPage();
		WebDriver driver;
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String Title=loginPage.validateLoginpageTitle();		
		Assert.assertEquals(Title,"XeroBusiness");
	}
	
	@Test(priority=2)
	public void xeroLogoImageTest() {
		boolean flag=loginPage.ValidatexeroImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		homePage=loginPage.Login(Prop.getProperty("username"),Prop.getProperty("password"));
		
}
		

	@AfterMethod
	public void tearDown() {
			driver.quit();
	}	
		
		
}
	
		
		
	  
