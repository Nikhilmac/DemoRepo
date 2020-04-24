// textbox is enabled or not

package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled 
{
     public static void main(String[] args) 
     {
	            
		String url="https://www.slideshare.net/login";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		boolean b=driver.findElement(By.name("user_login")).isEnabled();
		System.out.println(b);
		
     }
     
     

}
