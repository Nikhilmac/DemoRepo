package javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO153Buffer {
	public static void main(String[] args) {
		BufferedReader br=null;
		try {
		br=new BufferedReader(new FileReader("E:\\WAS 8.5\\VMWare workstation 14\\jalaeclipse\\Corejava\\hyd.txt"));
        String line;
        while((line =br.readLine())!=null) {
        	System.out.println(line);
        }		
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
