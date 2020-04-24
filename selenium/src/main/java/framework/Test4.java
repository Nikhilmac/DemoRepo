package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	
	 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("firstname")).sendKeys("Ail");
			driver.findElement(By.id("u_0_o")).sendKeys("5555");
			driver.findElement(By.id("u_0_v")).sendKeys("5555");
			Select dd=new Select(driver.findElement(By.id("day")));
			dd.selectByVisibleText("11");
			WebElement radio=driver.findElement(By.id("u_0_a"));
			radio.click();
			
			driver.close();
		}

}
