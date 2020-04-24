package popupalerts;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDe {

	public static void main(String[] args) throws InterruptedException {
		         
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    driver.findElement(By.name("cusid")).sendKeys("jalajala");
	    driver.findElement(By.name("cusid")).submit();
	    Alert alert=driver.switchTo().alert();
	    String alertmesg=driver.switchTo().alert().getText();
	    System.out.println(alertmesg);
	    Thread.sleep(5000);
	    alert.accept();
	    

	}

}
