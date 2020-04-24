package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Implicit {
	
	@Test
	public void show() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url="http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		driver.manage().window().maximize();
		String etitle="Demo Guru99 Page";
		String atitle="";
		atitle=driver.getTitle();
		if(etitle.equals(atitle)) {
			System.out.println("passed");
			}
		else {
			System.out.println("failed");
		}
		driver.close();
		
		
		
	}
  
	
	

	
	
	
	
	
}
