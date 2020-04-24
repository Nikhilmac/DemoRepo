package programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElem {
public static void main(String[] args) {
// TODO Auto-generated method stub	
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to(" http://demo.guru99.com/test/ajax.html");
driver.manage().window().maximize();
//driver.findElement(By.id("no")).click();

List <WebElement> dd=driver.findElements(By.name("name"));
System.out.println(dd.size());



}

}