package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property2
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=null;
		Properties pro = new Properties();
		FileInputStream in = new FileInputStream("E:\\WAS 8.5\\VMWare workstation 14\\jalaeclipse\\"
				+ "selenium\\src\\main\\java\\framework\\cong2.properties");
		                                         
		pro.load(in);
		System.out.println(pro.getProperty("browser"));
		
		String browsername = pro.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		}else {
			System.out.println("No such Browser");
		}
		
		driver.get(pro.getProperty("url2"));
		driver.findElement(By.name("username")).sendKeys("nikhil");
		driver.findElement(By.name("username")).sendKeys(pro.getProperty("99784"));
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		driver.findElement(By.className("img-responsive")).isDisplayed();
		
		
		
		
	}

}
