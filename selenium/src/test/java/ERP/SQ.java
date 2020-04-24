package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SQ {
	public WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("ERP")).click();
		driver.findElement(By.linkText("TMS")).click();
		driver.findElement(By.linkText("ERP")).click();
		driver.findElement(By.xpath("//*[@id=\"hidemenu4\"]/section/a")).click();
		// driver.findElement(By.xpath("//*[@id=\"SalesMB\"]/a")).click();
		driver.findElement(By.xpath("//a/span[text()='Sales']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sales Quotation")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("New")).click();

	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pro.ziperp.net/");
		driver.manage().window().maximize();
		driver.findElement(By.id("EnterpriseId")).sendKeys("maco");
		driver.findElement(By.id("UserId")).sendKeys("Ziperpdemo");
		driver.findElement(By.id("Password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"lnkLogin\"]")).click();
		driver.findElement(By.id("txtCompanySearch")).sendKeys("demo company");
		driver.findElement(By.xpath("")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
