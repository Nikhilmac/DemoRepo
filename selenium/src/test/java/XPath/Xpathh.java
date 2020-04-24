package XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathh {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		  WebDriver  driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
	}

}
