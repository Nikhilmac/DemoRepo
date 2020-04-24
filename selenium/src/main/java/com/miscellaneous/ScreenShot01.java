package com.miscellaneous;
// 1. Write a test case to capture the screenshots with WebDriver

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ScreenShot01 {
	@Test
	public void Demo() throws IOException {
       	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=tr"
	    		+ "ue&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&"
	    		+ "ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
        this.takeSnapShot(driver,"E:\\mom.png ");
		}
	public static void takeSnapShot(WebDriver webdriver,String filepath) throws IOException {
		
		TakesScreenshot shot = ((TakesScreenshot)webdriver);
				
	    File src = shot.getScreenshotAs(OutputType.FILE);
	    File dest = new File(filepath);
	    FileUtils.copyFile(src, dest);
		
	}

}
