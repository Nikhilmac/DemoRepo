package QA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Fb {
	@Test
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("29");
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.id("u_0_a")).click();
	}
	

}
