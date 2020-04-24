package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/test/delete_customer.php");
    driver.manage().window().maximize();
    driver.findElement(By.name("cusid")).clear();
    driver.findElement(By.name("cusid")).sendKeys("NIKHIL");
    driver.findElement(By.name("cusid")).submit();
   Alert alert =  driver.switchTo().alert();
   String as = driver.switchTo().alert().getText();
   System.out.println(as);
   Thread.sleep(1000);
   alert.accept();
   
    
    
    
	}
}
	
	
	
	
	
