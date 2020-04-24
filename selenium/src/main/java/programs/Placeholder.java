package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Placeholder {
	public static void main(String[] args) {
	String url="https://www.slideshare.net/login";////https://www.facebook.com/";
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
   WebElement textBox=  driver.findElement(By.name("user_login"));//.sendKeys("deeps");
   String placeHolder=textBox.getAttribute("PlaCeHolDeR");
   System.out.println(driver.getTitle());
	//System.out.println(textBox.getAttribute("placeholder"));
	
	System.out.println(placeHolder);
	
	driver.quit();
	
	 	}
}
