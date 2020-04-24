package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praa {
	public static void main(String[] args) {
		String url="http://demo.guru99.com/test/login.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("abcd@gamil.com");
		WebElement passwd = driver.findElement(By.name("passwd"));
		passwd.sendKeys("khkhkhk");
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		driver.close();
		
		
		
	}

}
