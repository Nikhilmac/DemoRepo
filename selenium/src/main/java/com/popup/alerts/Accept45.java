/* 4. Clicking OK button of the alert using accept()
5. Clicking Cancel button of the alert using dismiss() */


package com.popup.alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accept45 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).clear();;
		driver.findElement(By.name("cusid")).sendKeys("nikhil");
		driver.findElement(By.name("cusid")).submit();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();          //  clicks on ok button
		alert.dismiss();         // clicks on cancel button
		
		
	}
}
