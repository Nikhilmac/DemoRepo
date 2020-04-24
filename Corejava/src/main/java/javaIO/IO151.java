package javaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;

public class IO151 {
	public static void main(String[] args)throws IOException {
		System.out.println("Enter Your Name ");
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		String name=br.readLine();
		System.out.println(name);
	}

}
