package com.xero.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xero.qa.base.TestBase;


public class LoginPage extends TestBase {
	//PageFactory or OR
	@FindBy(name="username")
    WebElement username;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'submit']")
	WebElement SignupBttn;
	
	@FindBy(xpath="//[contains(@class,'image-responsive')]")
	WebElement xeroLogo;
   //Initializing the page object:
	//WebDriver driver=new WebDriver();
	public LoginPage() {
		//WebDriver driver=new driver;	
	PageFactory.initElements(driver,this);
	
   }
	//Actions:	
	
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	public Boolean ValidatexeroImage() {
		return xeroLogo.isDisplayed();
	}
	public HomePage Login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
		
		
	}

	//public void validateLoginpageTitle() {
		// TODO Auto-generated method stub
		//return null;
	}

	

