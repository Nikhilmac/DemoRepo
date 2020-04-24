package com.erp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ErpEss {
	@Test
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https");
		driver.findElement(By.id("EnterpriseId")).sendKeys("ausol");
		driver.findElement(By.id("UserId")).sendKeys("");
		driver.findElement(By.id("Password")).sendKeys("13");
		driver.findElement(By.id("lnkLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"ESS_MainLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ESS_6\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ESS_6\"]/ul/li[8]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ESS_6\"]/ul/li[8]/a")).click();
		//driver.findElement(By.linkText("Punch Details")).click();

	}
}
