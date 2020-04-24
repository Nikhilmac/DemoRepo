package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpexpWait {
public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*Implicit Wait: 
          •During Implicit wait if the Web Driver cannot find it immediately because of 
                its availability, it will keep polling the DOM to get the element.
          •If the element is not available within the specified Time an NoSuchElementException will be raised.
          •The default setting is zero.
          •Once we set a time, the Web Driver waits for the period of the WebDriver object instance.
		  */
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));

		sendkeys(driver, firstname, 10, "testing");	
		sendkeys(driver, lastname, 11,"nikhil");
		WebElement click=driver.findElement(By.linkText("Forgotten account?"));
		ClickOn(driver,click ,10);
		
		driver.close();
		
		/*Explicit Wait:  
                  •There can be instance when a particular element takes more than a minute to load.
                  •In that case you definitely not like to set a huge time to Implicit wait, as if you do 
                          this your browser will going to wait for the same time for every element.
                  •To avoid that situation you can simply put a separate time on the required element only.
                  *By following this your browser implicit wait time would be short for every element and it
                          would be large for specific element.*/
}
public static void sendkeys(WebDriver driver,WebElement element,int timeout ,String value) {
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}
	public static void ClickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}

