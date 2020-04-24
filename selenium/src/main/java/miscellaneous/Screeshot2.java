package miscellaneous;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Screeshot2 {
	@Test
    public void nikhil() throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(" https://www.facebook.com/");
	this.takeSnapShot(driver,"E:\\selenium\\Assingments\\screesh.png ");
	}
	public static void takeSnapShot( WebDriver webdriver , String fileWithPath) throws Exception {
		TakesScreenshot shot=((TakesScreenshot)webdriver);
		File srcFile= shot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(fileWithPath);
		FileUtils.copyFile(srcFile, destFile);
	
		
	}
}
