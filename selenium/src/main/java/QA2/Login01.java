// valid username and password

package QA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login01 {
	@Test
	public void demo() throws InterruptedException {
	//	/html/body/div[2]/div[2]/div/a[2]
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qamagnus.jalatechnologies.com/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		driver.findElement(By.id("UserName")).sendKeys("support@jalatechnologies.com");
		driver.findElement(By.id("Password")).sendKeys("Heena");
		driver.findElement(By.id("btnLogin")).click();
				
		
	}

}
