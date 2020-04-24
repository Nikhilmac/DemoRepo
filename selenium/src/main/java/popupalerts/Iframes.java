package popupalerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("https://www.toolsqa.com/iframe-practice-page/");
		 List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		 System.out.println("The total number of iframes are "  +iframeElements.size());

	}

}
