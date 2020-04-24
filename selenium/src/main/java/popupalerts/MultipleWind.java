package popupalerts;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWind {
        public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Click Here")).click();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		String mainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext()) {
			String childwindow =i1.next();
			if(!mainWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.name("emailid")).sendKeys("jalala@gmail.com");
				driver.findElement(By.name("emailid")).submit();			
			}
		}
		driver.switchTo().window(mainWindow);
	}
}


		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String mainWindow =driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String childwindow =i1.next();
			if(!mainWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.name("emailid")).sendKeys("jalala@gmail.com");
				driver.findElement(By.name("emailid")).submit();
				
			}
		}*/
		//driver.switchTo().window(mainWindow);
		
	


