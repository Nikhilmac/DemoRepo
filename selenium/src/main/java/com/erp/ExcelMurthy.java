package com.erp;
/*
import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
*//*
public class ExcelMurthy {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  FileInputStream fi = new FileInputStream("E:\\LoginTestData.xlsx");
		 Workbook wb = Workbook.getWorkbook(fi);
		 Sheet s = (Sheet) wb.getSheet("Gmail");
		 
			 
			 driver.findElement(By.id("identifierId")).clear();
		
			 driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0, 1).getContents());
			 driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
			 driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
				Thread.sleep(10000);
				
		
		  
		  
	  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = new FirefoxDriver();
	  driver.get("http://gmail.com");
	  Thread.sleep(3000);
	  //driver.manage().deleteAllCookies();
  }

  @AfterTest
  public void afterTest() {
  }
}
*/