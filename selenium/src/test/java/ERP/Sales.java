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

public class Sales {
	public WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"hidemenu4\"]/section/a")).click();
		// driver.findElement(By.xpath("//*[@id=\"SalesMB\"]/a")).click();
		driver.findElement(By.xpath("//a/span[text()='Sales']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Invoice")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"gridview-1031-record-ext-record-1\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen1018\"]/div[1]/div[1]/section/div/div[1]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Save")).click();
		Thread.sleep(5000);
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Yes']/parent::button")))
				.click();
		// Alert alert=driver.switchTo().alert();
		// alert.accept();

		// driver.findElement(By.xpath("//*[@id=\"gridview-1031-record-ext-record-1\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Chrome 76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pro.ziperp.net/");
		driver.manage().window().maximize();
		driver.findElement(By.id("EnterpriseId")).sendKeys("maco");
		driver.findElement(By.id("UserId")).sendKeys("Ziperpdemo");
		driver.findElement(By.id("Password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"lnkLogin\"]")).click();
		driver.findElement(By.id("txtCompanySearch")).sendKeys("demo company");
		driver.findElement(By.xpath("//*[@id=\"TenantTBL\"]/tbody/tr[47]/td/label")).click();
	}

	@AfterTest
	public void afterTest() {

		driver.close();
	}

}
