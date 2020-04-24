package expections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

/*while using FileInputStream and FileOutputStream and RandomAccessFile classes 
  we need to pass
  path of the file on to their constructors
  in case in file in the 
  specified path doesnot 
  exist them filenotfoundexception occurs*/

public class Exp1411
{
	public static void main(String[] args)throws Exception
	{
		File file=new File("myfile");
		//FileInputStream f1=new FileInputStream(file);
		FileReader x=new FileReader(file);
		System.out.println("JAVA");

	}

}
