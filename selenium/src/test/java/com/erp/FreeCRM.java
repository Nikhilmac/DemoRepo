package com.erp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FreeCRM {
	public WebDriver driver;

	@Test
	public void f() {

		driver.findElement(By.xpath("//input[@name='email' and @type = 'text']")).sendKeys("nikhil");
		driver.findElement(By.xpath("//input[@name='password' and @type = 'password']")).sendKeys("1231");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@BeforeTest
	public void beforeTest() {
		String url = "https://ui.freecrm.com/";
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}