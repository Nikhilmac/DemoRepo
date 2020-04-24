package com.automation.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.loginPage;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ExcelDataProvider;

public class loginTest extends BaseClass {

	@Test
	public void loginApp() throws InterruptedException, IOException {
		ExcelDataProvider excel = new ExcelDataProvider();
		loginPage loginpage = PageFactory.initElements(driver, loginPage.class);
		/**
		 * This is Abstraction Showing essential features and hinding background
		 * details.
		 */
		loginpage.logintocrm(excel.getStringData("nikhil", 0, 0), excel.getStringData("nikhil", 0, 1));
		System.out.println("After Start : " + driver.getTitle());
	}

}