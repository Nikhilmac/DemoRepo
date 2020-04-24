package com.QAMagnus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErpApp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" ");
		driver.findElement(By.id("EnterpriseId")).sendKeys("asol");
		driver.findElement(By.id("UserId")).sendKeys("11");
		driver.findElement(By.id("Password")).sendKeys("1");
		driver.findElement(By.id("lnkLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"ESS_MainLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ESS_6\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ESS_6\"]/ul/li[8]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ESS_6\"]/ul/li[8]/a")).click();
		//driver.findElement(By.linkText("Punch Details")).click();
		
	
				

	}
}
