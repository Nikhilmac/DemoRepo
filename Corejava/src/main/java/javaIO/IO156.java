package javaIO;

import java.io.FileWriter;

public class IO156 {
	public static void main(String[] args)throws Exception
	{
		FileWriter fr=null;
		try
		{
			fr=new FileWriter("jala.txt");
			String name="ameerpet";
			fr.write(name);
			}
	
	catch(Exception e) {
		e.printStackTrace();
		
	}
	
	finally {
		fr.close();
	}

}
}