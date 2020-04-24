package popupalerts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Progrm {
   
	 public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	    driver.manage().window().maximize();
		String ss=driver.getWindowHandle();
		System.out.println(ss);
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
	}
}
