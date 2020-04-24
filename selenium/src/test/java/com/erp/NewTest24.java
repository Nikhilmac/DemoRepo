package com.erp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest24 {
	
	public WebDriver driver;
  @Test
  public void f() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		driver.findElement(By.id("UserName")).sendKeys("support@jalatechnologies.com");
        driver.findElement(By.name("Password")).sendKeys("Heena");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	//	driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
	//	driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
	  
	  
  }
  
  
  @Test
  public void login() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("Nikhil");
	      driver.findElement(By.id("LastName")).sendKeys("porika");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[1]/a")).click();

		  driver.findElement(By.id("FirstName")).sendKeys("Nikhil");
	      driver.findElement(By.id("LastName")).sendKeys("porika");
		  
	  
  }
 /* @Test
  public void create() {
	  driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[3]/ul/li[1]/a")).click();

	  driver.findElement(By.id("FirstName")).sendKeys("Nikhil");
      driver.findElement(By.id("LastName")).sendKeys("porika");
	  
  }*/
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://qamagnus.jalatechnologies.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  }

  @AfterTest
  public void afterTest() {
	  
	// driver.close();
  }

}
