package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoo {

	public static void main(String[] args) {
		    
		String url="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();		
			driver.get(url);
		// driver.findElement(By.id("email")).sendKeys("BrightITCareer");
		// driver.findElement(By.name("email")).sendKeys("BrightITCareer");
		 driver.findElement(By.className("inputtext")).sendKeys("BrightITCareer");
		 driver.quit();

		}

	}










          

