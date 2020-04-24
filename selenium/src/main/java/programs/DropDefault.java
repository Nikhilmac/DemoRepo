package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDefault
{
public static void main(String[] args) 
{	
	String url="https://www.facebook.com/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	Select Dr  =  new Select(driver.findElement(By.id("year")));
     WebElement deflt=Dr.getFirstSelectedOption();
     String dd= deflt.getText();
     System.out.println(dd);
     driver.close();
     
     

}
}
