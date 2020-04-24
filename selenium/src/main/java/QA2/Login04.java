package QA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login04 {
	
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://qamagnus.jalatechnologies.com/");
	}
	
	@Test
	public void demo() throws InterruptedException {
	//	/html/body/div[2]/div[2]/div/a[2]
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		driver.findElement(By.id("UserName")).sendKeys("support04@jalatechnologies.com");
		driver.findElement(By.id("Password")).sendKeys("HHeena");
		driver.findElement(By.id("btnLogin")).click();
				
		
	}
	
	@AfterClass
	public void tearDown() {
		
	}

}
