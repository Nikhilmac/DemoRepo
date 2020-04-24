
package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProertyFIle {

	public static void main(String[] args) throws IOException {
		WebDriver driver= null;
		Properties p=new Properties();
		FileInputStream ip = new FileInputStream("E:\\WAS 8.5\\VMWare workstation 14\\jalaeclipse\\selenium\\src\\main\\java\\framework\\cong.properties");
		
		p.load(ip);
		
		System.out.println(p.getProperty("browser"));
		String browsername = p.getProperty("browser");
		if(browsername.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		  		 driver=new ChromeDriver();
		  		 		  		}
		else if(browsername.equals("ff")){
			 driver=new FirefoxDriver();
			}
		else if(browsername.equals("interexplorr")){
			 driver=new FirefoxDriver();
		
	}
		else if(browsername.equals(" safari")){
			 driver=new FirefoxDriver();
}
		else
		{
			System.out.println(" No Browser");
		}
		
		driver.get(p.getProperty("url"));
		
		
		
		
		
		
		
		
		
		
		
		
	}}
