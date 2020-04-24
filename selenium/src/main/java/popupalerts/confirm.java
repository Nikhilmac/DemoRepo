package popupalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirm {
         
	  public static void main(String[] args) throws InterruptedException {
		
		  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			 WebDriver  driver=new ChromeDriver();
		    driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//*[@id=\"content\"]/p[8]/button")).click();
		    Alert confirm =  driver.switchTo().alert();
		    String ss=driver.switchTo().alert().getText();
		    System.out.println(ss);
		    Thread.sleep(500);
		    confirm.accept();
		    confirm.dismiss();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}
