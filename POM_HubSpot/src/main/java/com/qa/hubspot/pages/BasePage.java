package com.qa.hubspot.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public WebDriver driver;
	public Properties prop;

	/**
	 * 
	 * @param browser
	 * @return This Menthod Will Return Driver On Basis of Browser.
	 */

	public WebDriver init_driver(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		} else if (browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		} else {
			System.out.println(browser + "------------> No browserr is defined ");
		}

		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		return driver;

	}
/**
 * 
 * @return This Method Will Load Config Properties and will return prop object
 */
	
	
	public Properties init_prop() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("E:\\WAS 8.5\\VMWare workstation 14\\jalaeclipse"
					+ "\\POM_HubSpot\\src\\main\\java\\com\\qa\\hubspot\\config");
			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;

	}
}