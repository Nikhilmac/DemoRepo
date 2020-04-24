package com.QAMagnus;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchUser {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://qamagnus.jalatechnologies.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
	driver.findElement(By.id("UserName")).sendKeys("support@jalatechnologies.com");
    driver.findElement(By.name("Password")).sendKeys("Heena");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.name("FirstName")).sendKeys("nikhil");
	driver.findElement(By.id("btnSearch")).click();
	}
}
