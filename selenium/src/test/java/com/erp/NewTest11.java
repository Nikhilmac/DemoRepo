package com.erp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest11 {
	public WebDriver driver;
   @Test
  public void f() {
	
	  WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("abcd@gamil.com");
		WebElement passwd = driver.findElement(By.name("passwd"));
		passwd.sendKeys("khkhkhk");
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
  }
  @BeforeTest
  public void beforeTest() {
	 String url="http://demo.guru99.com/test/login.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	 driver.close();
  }
  

}
