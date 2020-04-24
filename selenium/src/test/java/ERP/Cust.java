package ERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cust {
	public WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"hidemenu4\"]/section/a")).click();
		// driver.findElement(By.xpath("//*[@id=\"SalesMB\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"AccountsMB\"]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Customers")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("New")).click();
		driver.findElement(By.id("Name")).sendKeys("Ziperpdemo");
		driver.findElement(By.linkText("Contact Details")).click();
		driver.findElement(By.id("c_Name")).sendKeys("Ziperpdemo");
		Select drp = new Select(driver.findElement(By.name("c_StateId")));
		drp.selectByVisibleText("Akleshwar");
		




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
		driver.findElement(By.xpath("//*[@id=\"TenantTBL\"]/tbody/tr[50]/td")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void afterTest() {

		//driver.close();
	}

}
