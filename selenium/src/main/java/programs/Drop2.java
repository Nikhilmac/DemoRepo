package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop2 {
public static void main(String[] args) {
	String url="http://qamagnus.jalatechnologies.com/Employee/Create";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get(url);
	Select c=new Select(d.findElement(By.name("CountryId")));
	c.selectByVisibleText("UK");
	
}
}
