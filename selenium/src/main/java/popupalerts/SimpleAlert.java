package popupalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
	    driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button")).click();
	    Alert alert = driver.switchTo().alert();
	    String al = driver.switchTo().alert().getText();
	    System.out.println(al);
	    Thread.sleep(2000);
	    alert.accept();
	    
	   
	    
	}
}
