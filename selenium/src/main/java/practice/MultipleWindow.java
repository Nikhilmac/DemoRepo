package practice;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindow
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php" );
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext())
		{
		String childwindow = i1.next();
		if(!mainwindow.equalsIgnoreCase(childwindow)) {
			driver.switchTo().window(childwindow);
			driver.findElement(By.name("emailid")).sendKeys("nikhil");
			driver.findElement(By.name("emailid")).submit();
			}
		}
		driver.switchTo().window(mainwindow);
	}
}
