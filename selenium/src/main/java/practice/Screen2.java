package practice;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Screen2 {
	@Test
	public void demo() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jalatechnologies.com/");
		Thread.sleep(5000);
		this.takeSnapShot(driver,"E:\\0018.png");
		}
	public static void takeSnapShot(WebDriver webdriver,String filepath) throws IOException {
		TakesScreenshot shot = ((TakesScreenshot)webdriver);
		File scrFile = shot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(filepath);
		FileUtils.copyFile(scrFile, destFile);
		
	}
}
