package ERP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Crm {
	public static void main(String[] args) throws InterruptedException {

	//	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.slientOutput", "true");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 80.3987.106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("porikanikhil45@gmail.com");
		driver.findElement(By.name("password")).sendKeys("nikhilnikhil");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		System.out.println("Login Successfull");
		driver.quit();

	}

}
