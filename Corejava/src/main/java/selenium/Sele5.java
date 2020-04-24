package selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sele5 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	        
	    
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe" );
	  driver=new ChromeDriver();
	    
	    
	    //driver = new FirefoxDriver();
    baseUrl = "https://www.freshersworld.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled4() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("span.right-buttons.register_free_link")).click();
    driver.findElement(By.id("firstname")).clear();
    driver.findElement(By.id("firstname")).sendKeys("nikhl");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("porianikhil@hak");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("4513");
    new Select(driver.findElement(By.id("currentCity"))).selectByVisibleText("Port Blair");
    driver.findElement(By.id("file-upload")).click();
    driver.findElement(By.linkText("I have read the terms and Conditions")).click();
    driver.findElement(By.id("remember_meview")).click();
    driver.findElement(By.id("remember_meview")).click();
    driver.findElement(By.id("remember_meview")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Forgot Password')])[2]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
