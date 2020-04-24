package com.erp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ErpDemo {
	@Test
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:///");
		driver.manage().window().maximize();
		driver.findElement(By.id("EnterpriseId")).sendKeys("");
		driver.findElement(By.id("UserId")).sendKeys("");
		driver.findElement(By.id("Password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"lnkLogin\"]")).click();
		driver.findElement(By.id("txtCompanySearch")).sendKeys("demo company");
		driver.findElement(By.xpath("//*[@id=\"TenantTBL\"]/tbody/tr[50]/td")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id=\"hidemenu4\"]/section/a")).click();	
		driver.findElement(By.xpath("//*[@id=\"AccountsMB\"]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("New")).click();
		for(int i=1;i<=2;i++) {
		driver.findElement(By.id("Name")).sendKeys("Ziperpdemo"+i);	
		driver.findElement(By.linkText("Contact Details")).click();
		driver.findElement(By.id("c_Name")).sendKeys("Ziperpdemo"+i);
		Select drp = new Select(driver.findElement(By.name("c_StateId")));
		drp.selectByVisibleText("Akleshwar");
		driver.findElement(By.linkText("Save")).click();
		}
		//driver.close();
		}
}
