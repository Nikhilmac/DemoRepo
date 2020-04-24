package udemy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Properties;

public class PropertiesTest {
	@Test
	public void f() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\WAS 8.5\\VMWare workstation 14\\jalaeclipse\\selenium\\src\\test\\java\\udemy\\Data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
