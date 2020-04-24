package popupalerts;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert11 {

	public static void main(String[] args) throws NoAlertPresentException ,InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    //driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("cusid")).clear();
	    driver.findElement(By.name("cusid")).sendKeys("nikhil");
	    driver.findElement(By.name("cusid")).submit();
	   // driver.findElement(By.name("submit")).submit();
	   // driver.findElement(By.name("submit")).click();
	   Alert alert = driver.switchTo().alert();
	   String almes= driver.switchTo().alert().getText();
	   System.out.println(almes);
	   Thread.sleep(5000);
	   alert.accept();
	    
	    //driver.quit();  
	}

}
