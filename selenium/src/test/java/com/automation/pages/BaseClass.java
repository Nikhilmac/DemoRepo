package com.automation.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.utility.BrowserFactory;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.StartApplication(driver, "Chrome", "https://ui.freecrm.com/");
		System.out.println("Before Start : " + driver.getTitle());

	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitbrowser(driver);

	}

}
