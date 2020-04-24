package selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sdem {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe" );
	  driver=new ChromeDriver();
    //driver = new FirefoxDriver();
    baseUrl = "http://qamagnus.jalatechnologies.com/";
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled10() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("UserName")).clear();
   driver.findElement(By.id("UserName")).sendKeys("nikhl");   
   driver.findElement(By.id("UserName")).getAttribute("placehoder") ;
   driver.findElement(By.id("UserName")).clear();
   Boolean enabled=driver.findElement(By.id("UserName")).isEnabled();
   System.out.println(enabled);
  }
  
  

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}