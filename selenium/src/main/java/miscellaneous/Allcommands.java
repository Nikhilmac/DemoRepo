// All commands
// Launch a new Firefox browser.
/*Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if the it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.*/
package miscellaneous;
import java.awt.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Allcommands {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.facebook.com/";
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys("kkkkk");
	WebElement intext=driver.findElement(By.id("email"));
	Dimension size=intext.getSize();
	System.out.println("width is :  " + size.width);
	System.out.println("Height is :  "+  size.height);
	org.openqa.selenium.Point p=intext.getLocation();
	System.out.println(p.x);
	System.out.println(p.y);
	//String text=intext.getText();
	String text=intext.getTagName();// email is input type :tagname is ""input"";
	System.out.println(text);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getTitle().length());
	System.out.println(driver.getClass());
	boolean result = driver.getPageSource().contains("String to find");
	System.out.println(result);
	String actualurl=driver.getCurrentUrl();
	if(actualurl.equals(url)) 
	{
		System.out.println("url correct");
	}
	else 
	{
		System.out.println("url worng");
	}	
	System.out.println("Actual url = " + actualurl);
	System.out.println("Expected url = " + url);
	System.out.println(driver.getPageSource().length());
	String dd=driver.getPageSource();
	System.out.println(dd.length());
	driver.quit();	
}
}
	
	
	
	

