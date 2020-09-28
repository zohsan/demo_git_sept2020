package com.xero.qa.test_cases;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xero.qa.base.TestBase;
import com.xero.qa.pages.ContactsPage;
import com.xero.qa.pages.HomePage;
import com.xero.qa.pages.LoginPage;
import com.xero.qa.util.TestUtil;

//import junit.framework.Assert;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testutil;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		super();
		}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testutil=new TestUtil();
		contactsPage=new ContactsPage();
		loginPage=new LoginPage();
		homePage=loginPage.Login(Prop.getProperty("username"),Prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String HomePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(HomePageTitle,"xero","Home Page Title not matched");
	}
	
	@Test(priority= 2)
	public void verifyuserNameTest() {
		testutil.SwitchToframe();
		Assert.assertTrue(homePage.correctuserName());	
	}
	@Test(priority=3)
	public void verifyContactslink() {
		testutil.SwitchToframe();
		contactsPage=homePage.clickoncontactslink();		
	}
	
	@AfterMethod
	public void tearDown() {
			driver.quit();
		
		
		
	}

}
