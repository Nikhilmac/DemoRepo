package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropallElements {
	
	 public static void main(String[] args) { 
			//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		    WebDriver driver = new ChromeDriver();
		    driver.get(baseURL);
		    
		    Select country=new Select(driver.findElement(By.name("country")));
		    country.selectByVisibleText("CUBA");
		    System.out.println(driver.findElement(By.name("country")).getText());
		    System.out.println(driver.findElement(By.name("country")).getSize());
		    
		    
		    
	 }
	 

}
