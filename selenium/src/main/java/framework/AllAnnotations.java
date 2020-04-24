package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
    @BeforeSuite
    public void demo1() {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("nikhil");
		driver.findElement(By.id("u_0_o")).sendKeys("9945612378");
		driver.findElement(By.id("u_0_v")).sendKeys("9945612378");
		Select dd=new Select(driver.findElement(By.id("day")));
		dd.selectByVisibleText("24");
		WebElement radio=driver.findElement(By.id("u_0_9"));
		radio.click();
		driver.close();
    }
    
    @BeforeTest
    
    public void demo2() {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("firstname")).sendKeys("akhil");
			driver.findElement(By.id("u_0_o")).sendKeys("11111");
			driver.findElement(By.id("u_0_v")).sendKeys("11111");
			Select dd=new Select(driver.findElement(By.id("month")));
			dd.selectByVisibleText("Feb");
			WebElement radio=driver.findElement(By.id("u_0_a"));
			radio.click();
			
			driver.close();
    }
    
    @BeforeClass
    public void demo3() {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("firstname")).sendKeys("srikanth");
			driver.findElement(By.id("u_0_o")).sendKeys("22222");
			driver.findElement(By.id("u_0_v")).sendKeys("22222");
			Select dd=new Select(driver.findElement(By.id("year")));
			dd.selectByVisibleText("1995");
			WebElement radio=driver.findElement(By.id("u_0_a"));
			radio.click();
			
			driver.close();
    }
    
    @Test
    public void demo4() {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("firstname")).sendKeys("Ail");
			driver.findElement(By.id("u_0_o")).sendKeys("5555");
			driver.findElement(By.id("u_0_v")).sendKeys("5555");
			Select dd=new Select(driver.findElement(By.id("day")));
			dd.selectByVisibleText("11");
			WebElement radio=driver.findElement(By.id("u_0_a"));
			radio.click();
			
			driver.close();
    }
    @Test
    public void demo5() {
  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("firstname")).sendKeys("sagar");
			driver.findElement(By.id("u_0_o")).sendKeys("99999");
			driver.findElement(By.id("u_0_v")).sendKeys("9999");
			Select dd=new Select(driver.findElement(By.id("year")));
			dd.selectByVisibleText("1996");
			WebElement radio=driver.findElement(By.id("u_0_9"));
			radio.click();
			
			driver.close();
    }
	
	
	

}
