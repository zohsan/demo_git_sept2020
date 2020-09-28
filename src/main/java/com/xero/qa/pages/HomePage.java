package com.xero.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xero.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//td[contains(text(),'user:FA')]")	
    WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Accounts')]")
	WebElement AccountsLink;
	
	@FindBy(xpath="//a[contains(text(),'business')]")
	WebElement businessLink;
	//Initializing the page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
		}
	
	public Boolean correctuserName() {
	return userNameLabel.isDisplayed();	
	}
	
	public ContactsPage clickoncontactslink() {
		contactsLink.click();
		return new ContactsPage();
	}
	public AccountsPage clickonAccountslink() {
		AccountsLink.click();
		return new AccountsPage();
	}		
	public BusinessPage clickonBusinesslink() {
		businessLink.click();
		return new BusinessPage();
		
	}
	//public String verifyHomePageTitle() {
		// TODO Auto-generated method stub
		//return ;
	
	}
	
	
	

