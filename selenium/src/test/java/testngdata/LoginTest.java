package testngdata;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.Testutil;
public class LoginTest {
	public WebDriver driver;
	@DataProvider
	public Object[][] getLoginData(){
		Object data[][]=Testutil.getTestData("login");
		return data;
	}
	   @Test(dataProvider = "getLoginData")
	   public void loginTest(String username,String password) {
	 	
	 	  driver.findElement(By.id("UserName")).sendKeys(username);
	 	  driver.findElement(By.id("Password")).sendKeys(password);
	 	  
	 	 driver.findElement(By.xpath("//input[@name='UserName' and @type = 'text']")).sendKeys(username);
	 	  driver.findElement(By.xpath("//input[@name='Password' and @type = 'password']")).sendKeys(password);
	 	
	 	
	 	  WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
	 	  JavascriptExecutor js=(JavascriptExecutor) driver;
	 	  js.executeScript("arguments[0].click();", loginBtn);
	   }
@BeforeTest
public void beforeTest() {
	 String url="http://qamagnus.jalatechnologies.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
}
@AfterTest
public void afterTest() {	  
	 driver.close();
}
}
