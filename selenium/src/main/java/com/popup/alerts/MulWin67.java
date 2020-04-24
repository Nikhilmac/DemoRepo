/*6. Handle single window using driver.getWindowHandle()
7. Handle multiple windows using driver.getWindowHandles()
*/
package com.popup.alerts;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MulWin67 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	 WebDriver  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://demo.guru99.com/popup.php");
	 driver.findElement(By.xpath("/html/body/p/a")).click();
	 String mainwindow = driver.getWindowHandle();
	 Set<String> ss = driver.getWindowHandles();
	 Iterator<String> dd = ss.iterator();
	 while(dd.hasNext()) {
		 String childwindow = dd.next();
			 if(!mainwindow.equalsIgnoreCase(childwindow)) {
				 driver.switchTo().window(childwindow);
				 driver.findElement(By.name("emailid")).sendKeys("nikhil@gmail.com");
	     		 driver.findElement(By.name("emailid")).submit();	 
		 }
	 }
	 driver.switchTo().window(mainwindow);
	 }
}
