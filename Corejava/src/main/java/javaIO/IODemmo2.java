package javaIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class IODemmo2 {

	public static void main(String[] args)throws Exception {
	   File f=new File("Sagar");
		FileOutputStream a=new FileOutputStream(f);
		DataOutputStream b=new DataOutputStream(a);
		b.writeUTF("This is demo Program : ");
		
		
		FileInputStream x=new FileInputStream(f);
		DataInputStream y=new DataInputStream(x);
		String name=y.readUTF();
		System.out.println(name);
	}

}
