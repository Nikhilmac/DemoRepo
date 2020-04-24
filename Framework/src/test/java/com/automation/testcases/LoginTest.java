package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.utility.BrowserFactory;

public class LoginTest {
    WebDriver driver;

	@Test
	public void loginApp() {
		driver = BrowserFactory.StartApplication(driver, "Chrome", "https://freecrm.co.in/");
		System.out.println(driver.getTitle());
	}

}
