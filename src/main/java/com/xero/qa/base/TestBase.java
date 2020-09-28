package com.xero.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.xero.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties Prop;
	
	public TestBase() {
		try {
			String propertyFileContents = readPropertyFileContents();

			BufferedReader metadataReader = new BufferedReader(new InputStreamReader(new FileInputStream("migrateSchemaGenProps.properties")));
			Properties props = new Properties();
			props.load(new StringReader(IOUtils.getStringFromReader(metadataReader).replace("\\", "/")));
			Prop =new Properties();
			FileInputStream ip= new FileInputStream("C:\Users\zohsa\eclipse-workspace\Xero\src\main\java\com\xero\qa\config\config.properties");
			Prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}   
			
	

public static void initialization(){
	String browserName=Prop.getProperty("Browser");
	if (browserName.equals("chrome")){
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	}
	else if(browserName.equals("FF")){
		FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver1;
		WebDriverManager.iedriver().setup();
		driver=new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait,TimeUnit.SECONDS);
		
		driver.get(Prop.getProperty("url"));
		
	}
	
	
	//driver.get("https://www.google.com");
		
	}
	
}
