package miscellaneouspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Mouse
{
public static void main(String[] args)
{
/* declaration and instantiation of objects/variables */
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
String baseWebUrl = "https://www.flipkart.com/";
driver.get(baseWebUrl);
driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
/* get the actual value of the title */
//WebElement headerelement = driver.findElement(By.linkText("Home"));
WebElement ele=driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div[3]/div/a/div[1]/div/img"));

//WebElement headerelement = driver.findElement(By.xpath("//*[@id=\'container\']/div/header/div[3]/ul/li[1]/span"));
Actions builder = new Actions(driver);
//Action mouseoverevent = builder.moveToElement(headerelement).build();
Action mouseoverevent = builder.moveToElement(ele).click().build();
mouseoverevent.perform();
/* closing Firefox Browser and System */
//driver.close();
}
}