package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.manage().window().maximize();
		driver.get(url);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(" Total links are : " +links.size());
		System.out.println(links.getClass());
		
		
	}

}
