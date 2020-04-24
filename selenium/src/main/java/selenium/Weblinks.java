package selenium;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Weblinks
{
	public static void main(String[] args)
	{
				 //System.setProperty("webdriver.firefox.marionette","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe" );
		         // driver=new ChromeDriver();
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe" );
	       WebDriver  driver=new ChromeDriver();
			//WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement arr:links) 
		{
			System.out.println(arr.getAttribute("href"));
			System.out.println(arr.getText());
		}	
	}
}
