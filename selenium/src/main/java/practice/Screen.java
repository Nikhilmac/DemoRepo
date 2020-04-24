package practice;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Screen {
	@Test
	public void show() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
		this.takeSnapShot(driver,"E:\\nikhil.png");
		}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath)throws Exception {
		TakesScreenshot shot = ((TakesScreenshot)webdriver);
		File scrfile = shot.getScreenshotAs(OutputType.FILE);
		File destfile = new File(fileWithPath);			
		FileUtils.copyFile(scrfile, destfile);
		
		
	
	}
}
