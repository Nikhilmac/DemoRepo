
package com.QAMagnus;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateUser {
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
		driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.id("FirstName")).sendKeys("mmmm");
		driver.findElement(By.id("LastName")).sendKeys("yyyyy");
		driver.findElement(By.name("EmailId")).sendKeys("uyuyyuyyu@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nikki");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("nikki");
		driver.findElement(By.id("MobileNo")).sendKeys("4578980798");
		//new Select(driver.findElement(By.id("ExpiryType"))).selectByIndex(0);
		Select ss=new Select(driver.findElement(By.id("ExpiryType")));
		ss.selectByVisibleText("7 Days");
		//driver.findElement(By.id("ExpiryType")).sendKeys("01/01/2050");
		driver.findElement(By.id("ExpiryType")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[3]/td[5]"));
		//*[@id="frmUser"]/div[1]/div/div[4]/div/label/span
		
		driver.findElement(By.xpath("//*[@id=\"frmUser\"]/div[1]/div/div[4]/div/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"frmUser\"]/div[2]/button")).click();
		//*[@id="frmUser"]/div[2]/button
		}
}
