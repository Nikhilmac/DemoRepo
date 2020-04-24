// Refer : https://www.guru99.com/select-option-dropdown-selenium-webdriver.html


package programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class DropFullPrograms {
 public static void main(String[] args) { 
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new ChromeDriver();
	    driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ARUBA");
		drpCountry.selectByIndex(8);
		
		boolean c=drpCountry.isMultiple();
		System.out.println(c);

	   // Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		fruits.selectByIndex(3);
		
		boolean v=fruits.isMultiple();
		System.out.println(v);		
 }
}