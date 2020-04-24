package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("  http://demo.guru99.com/test/web-table-element.php " );
		List<WebElement> ss=driver.findElements(By.xpath(" //*[@id=\"leftcontainer\"]/table/thead/tr/th[1] "));
		System.out.println(ss.size());
		List<WebElement> dd=driver.findElements(By.xpath(" //*[@id=\"leftcontainer\"]/table/thead/tr/th[1] "));
		System.out.println(dd.size());


	}

}
