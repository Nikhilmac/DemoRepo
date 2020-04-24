
// 2 windows


package programs;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Windows2{
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe" );
	  WebDriver driver=new ChromeDriver();
// driver.get("http://demoqa.com/frames-and-windows/");
	  driver.navigate().to("http://demoqa.com/frames-and-windows/");
 driver.get("https://www.facebook.com/ ");
 //driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
 driver.navigate().back();
 driver.navigate().forward();
 driver.navigate().refresh();
 
 driver.close();
 }
}