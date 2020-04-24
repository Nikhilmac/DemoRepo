// 8. Switch to window using driver.switchTo().window()
package com.popup.alerts;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow08 {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	 WebDriver  driver=new ChromeDriver();
   driver.get("http://jalatechnologies.com/");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"banner\"]/div/div/div/div/div[2]/a[2]")).click();
   String mainwindow = driver.getWindowHandle();
   System.out.println(mainwindow);
   Set<String> se = driver.getWindowHandles();
   System.out.println(se);
   Thread.sleep(2000);
   driver.switchTo().window(mainwindow);
	
}
}
