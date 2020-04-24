package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
	
	 public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("firstname")).sendKeys("srikanth");
			driver.findElement(By.id("u_0_o")).sendKeys("22222");
			driver.findElement(By.id("u_0_v")).sendKeys("22222");
			Select dd=new Select(driver.findElement(By.id("year")));
			dd.selectByVisibleText("1995");
			WebElement radio=driver.findElement(By.id("u_0_a"));
			radio.click();
			
			driver.close();
		}

}
