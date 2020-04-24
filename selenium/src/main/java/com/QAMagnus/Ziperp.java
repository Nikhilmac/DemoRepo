package com.QAMagnus;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Ziperp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("htt/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		driver.findElement(By.id("EnterpriseId")).sendKeys("co");
		driver.findElement(By.id("UserId")).sendKeys("mo");
        driver.findElement(By.id("Password")).sendKeys("1");
        driver.findElement(By.id("lnkLogin")).click();
    //	driver.findElement(By.id("txtCompanySearch")).sendKeys("DEMO COMPANY 1");
    	driver.findElement(By.xpath("//*[@id=\"TenantTBL\"]/tbody/tr[30]/td")).click();
    	driver.findElement(By.xpath("//*[@id=\"hidemenu4\"]/section/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"SalesMB\"]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"SalesQuatation\"]/a")).click();
	}
}