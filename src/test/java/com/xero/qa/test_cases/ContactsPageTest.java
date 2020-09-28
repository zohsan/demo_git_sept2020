package com.xero.qa.test_cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xero.qa.base.TestBase;
import com.xero.qa.pages.ContactsPage;
import com.xero.qa.pages.HomePage;
import com.xero.qa.pages.LoginPage;
import com.xero.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testutil;
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		super();
		}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testutil=new TestUtil();
		contactsPage=new ContactsPage();
		loginPage=new LoginPage();
		homePage=loginPage.Login(Prop.getProperty("username"),Prop.getProperty("password"));
		testutil.SwitchToframe();
		contactsPage=homePage.clickoncontactslink();
	}
	
	
	@Test(priority=1)
	public void verifyverifyContactsPagelabelTest() {
		//String HomePageTitle=homePage.verifyHomePageTitle();
		Assert.assertTrue(contactsPage.verifyContactslabel(),"contacts label is missing on the page");
	}
	
	@Test(priority= 2)
	public void selectcontactsTest() {
		contactsPage.selectcontactsByName();
		}
	@Test(priority=3)
	public void multipleContactsTest() {
		contactsPage.selectcontactsByName();
				
	}
	
	@AfterMethod
	public void tearDown() {
			driver.quit();
		
		
		
	}

}


