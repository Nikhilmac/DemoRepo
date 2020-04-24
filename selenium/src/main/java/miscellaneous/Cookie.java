package miscellaneous;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookie {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://demo.guru99.com/test/cookie/selenium_aut.php";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("rahul");
		driver.findElement(By.name("password")).sendKeys("nnnn");
		driver.findElement(By.name("submit")).click();
		//create file names cookies to store login information
		File file = new File("Cookies.data");		
		try
		{
			file.delete();
			file.createNewFile();
			FileWriter filewrite=new FileWriter(file);
			
			BufferedWriter bwrite =new BufferedWriter(filewrite);
			
			for(org.openqa.selenium.Cookie ck:driver.manage().getCookies()) {
				
				bwrite.write((ck.getDomain()+" ;"+ ck.getName()+" ;"+ck.getPath()+" ;"+ck.getValue()+" ;"+
				ck.getExpiry()+" ;"+ck.isSecure()));
				bwrite.newLine();
						
			}
			
			bwrite.close();
			filewrite.close();
			}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		
		
		
		

	}

}
