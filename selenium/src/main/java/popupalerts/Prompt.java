package popupalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
        
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
	    driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/p[11]/button")).click();
	    Alert promptalert=driver.switchTo().alert();
	    String ss=driver.switchTo().alert().getText();
	    System.out.println(ss);
	    promptalert.sendKeys("nikhkl");
	    Thread.sleep(5000);
	    promptalert.accept();
	    driver.close();
	    
	}
}
