package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticRadio {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
	    WebElement radio=	driver.findElement(By.id("vfb-7-1"));
	    radio.click();
	    System.out.println("Radio button is selected");
		driver.findElement(By.id("vfb-7-2")).click();
		
		
		WebElement ff=driver.findElement(By.id("vfb-6-0"));
		ff.click();
		
		  if (ff.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
		
		
		//driver.findElement(By.id("vfb-6-1")).click();
		//driver.findElement(By.id("vfb-6-2")).click();
		
		
		
		
		
	}
	

}
