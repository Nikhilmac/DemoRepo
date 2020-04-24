package miscellaneous;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table {
    public static void main(String[] args) throws ParseException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
        List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        //xpath  //*[@id="leftcontainer"]/table/thead/tr/th[1]
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List  rows = wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]")); 
        //xpath rows <td>..</td> .....//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1].... (( remove [1] frm tr))
        System.out.println("No of rows are : " + rows.size());
        wd.close();
    }
}