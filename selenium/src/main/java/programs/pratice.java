package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pratice {
	public static void main(String[] args) {
		String url="http://demo.guru99.com/test/newtours/register.php";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get(url);
		Select s=new Select(d.findElement(By.name("country")));
		s.selectByVisibleText("CUBA");
		s.selectByIndex(6);
	    boolean b= s.isMultiple();
	    System.out.println(b);
	    String url2="http://jsbin.com/osebed/2";
	    d.get(url2);
	    Select s2 = new Select(d.findElement(By.id("fruits")));
	    s2.selectByVisibleText("Apple");
	    s2.selectByIndex(3);
	    s2.selectByVisibleText("Banana");
        boolean bb=s2.isMultiple();
        System.out.println(bb);
        d.quit();
	    
	    
	    
		
		
		
	}

}
