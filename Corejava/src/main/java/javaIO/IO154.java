package javaIO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IO154 {
	public static void main(String[] args) throws FileNotFoundException {
		String name="Program TO Write File Using BufferedOutput ";
		byte byteData[]=name.getBytes();
		try
		{	
			FileOutputStream a=new FileOutputStream("mani.txt");
		    BufferedOutputStream x=new BufferedOutputStream(a);
		    x.write(byteData);
		    x.close();
		    
		    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
