// 9. Switch to frame using driver.switchTo().frame()

package com.popup.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe09 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("a077aa5e")).click();
		driver.switchTo().frame("a077aa5e"); //switching the frame by ID
		System.out.println("We are switch to the iframe");
  		driver.findElement(By.xpath("html/body/a/img")).click();
		//Clicks the iframe
        System.out.println("We are done");
	}
}
