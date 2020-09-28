package com.xero.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xero.qa.base.TestBase;

public class ContactsPage extends TestBase {
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement Contactslabel;
	
	public  ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	public Boolean verifyContactslabel() {
		return Contactslabel.isDisplayed();
	}
	public void selectcontactsByName() {
	driver.findElement(By.xpath("//a[contains(text(),'names']"));
		}
}