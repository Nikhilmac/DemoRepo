package javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IO158 {
	public static void main(String[] args) throws IOException {
			try 
		{
		FileWriter fr=new FileWriter("Manual Testing");
		BufferedWriter br= new BufferedWriter(fr);
		String name="nikhilinikhnlijklij";
		br.write(name);
		br.close();
		}
			catch(Exception e) {
				e.printStackTrace();		}
	}

}
