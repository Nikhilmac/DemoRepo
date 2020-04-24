package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
		String ss = driver.getWindowHandle();
		System.out.println(ss);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);		
	}
}
