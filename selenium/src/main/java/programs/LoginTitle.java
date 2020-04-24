//program to get login title

package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTitle {
	public static void main(String[] args) {
		String url="https://retail.onlinesbi.com/retail/login.htm";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
