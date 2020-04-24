package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Date {
	
	@Test

	public void Nikhill() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url="http://demo.guru99.com/test/";
		driver.manage().window().maximize();
		driver.get(url);
		WebElement ss=driver.findElement(By.xpath(" /html/body/form/input[1] "));
		ss.sendKeys("09252013");
		ss.sendKeys(Keys.TAB);
		ss.sendKeys("0325PM");
	}

}
