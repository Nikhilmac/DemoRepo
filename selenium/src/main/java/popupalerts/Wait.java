

package popupalerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	    //driver.manage().window().maximize();
	    driver.findElement(By.id("timingAlert")).click();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    
        // Wait for Alert to be present
 
        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
 
        System.out.println("Either Pop Up is displayed or it is Timed Out");
 
        // Accept the Alert
 
        myAlert.accept();
 
        System.out.println("Alert Accepted");

		  
		  
		  
	}
	
	
	
	

}
