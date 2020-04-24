
//program to  type text in textbox


package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextBox 
{
	public static void main(String[] args) 
	{
	String url="https://www.slideshare.net/login";////https://www.facebook.com/";
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
    driver.findElement(By.name("user_login")).sendKeys("deeps");
    System.out.println(driver.getTitle());
	driver.quit();
	
	 }
}
