//  10. Switch to popup using driver.switchTo.alert()

package com.popup.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert10 {
	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
		 ////*[@id="content"]/p[4]/button
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
		 
	}

}
