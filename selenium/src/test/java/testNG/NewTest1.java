package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  WebElement c=driver.findElement(By.id("email"));
		//c.sendKeys("nikhikink");
		System.out.println(c.getText());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("25");
	    new Select(driver.findElement(By.id("month"))).selectByVisibleText("Feb");
	   // System.out.println(driver.findElement(By.));
 }
  
  @Test
  public void linkTest() {
	  driver.findElement(By.linkText("Term")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
