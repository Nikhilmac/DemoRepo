package com.automation.utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public WebDriver driver;

	public static WebDriver StartApplication(WebDriver driver, String browserName, String url) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
			// driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "");
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("We Donot Support this Browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;

	}

	public static void quitbrowser(WebDriver driver) {
		driver.quit();

	}
}
