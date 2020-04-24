// invalid unsername and valid password

package QA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login02 {
	@Test
	public void demo() throws InterruptedException {
	//	/html/body/div[2]/div[2]/div/a[2]
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qamagnus.jalatechnologies.com/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		driver.findElement(By.id("UserName")).sendKeys("support02@jalatechnologies.com");
		driver.findElement(By.id("Password")).sendKeys("Heena");
		driver.findElement(By.id("btnLogin")).click();
				
		
	}

}
