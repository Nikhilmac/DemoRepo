package javaIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IODemo {
	public static void main(String[] args)throws Exception {
		File f=new File("Nikhil.txt");
		FileOutputStream x=new FileOutputStream(f);
		DataOutputStream a=new DataOutputStream(x);
		a.writeUTF(" I done with java ");
		
		FileInputStream y=new FileInputStream(f);
		DataInputStream c=new DataInputStream(y);
		String name=c.readUTF();
		System.out.println(name);
		
	}

}
