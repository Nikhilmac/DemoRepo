package javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class IO159 {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		/*FileOutputStream x=new FileOutputStream("java.properties");
		p.setProperty("url","localhost/9061");
		p.setProperty("add", "host/1212");
		p.setProperty("address","password/7878");
		p.store(x,null);*/
		FileInputStream f=new FileInputStream("java.properties");
		p.load(f);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("add"));
		p.list(System.out);
		
		
		
	}

}
