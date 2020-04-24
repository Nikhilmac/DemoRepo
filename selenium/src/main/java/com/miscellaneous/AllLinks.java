// ALl avaliable links on a page
package com.miscellaneous;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AllLinks
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> dd= driver.findElements(By.tagName("a"));
		System.out.println(dd.size());
		for(WebElement arr : dd) {
		    System.out.println(arr.getAttribute("href"));
			System.out.println(arr.getText());
		}
		driver.close();	
	}
}
