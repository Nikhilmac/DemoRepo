package selenium;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class PartialText 
{				
    		
    public static void main(String[] args)
    {									
        String baseUrl = "https://www.facebook.com";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("ges")).click();					
        System.out.println("title of page is: " + driver.getTitle());
        //driver.quit();			
    }		

}	