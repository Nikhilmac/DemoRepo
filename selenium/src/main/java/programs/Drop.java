//drop down when more than one dropdown.

package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Drop
{
public static void main(String[] args) 
{	
	String url="https://www.facebook.com/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\Downloads\\chromedriver.exe");
	//C:\Users\ADMIN\Downloads\Downloads
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	WebElement c=driver.findElement(By.id("email"));
	//c.sendKeys("nikhikink");
	System.out.println(c.getText());
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	new Select(driver.findElement(By.id("day"))).selectByVisibleText("25");
    new Select(driver.findElement(By.id("month"))).selectByVisibleText("Feb");
   // System.out.println(driver.findElement(By.));

}

}
