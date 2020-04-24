package jala.Corejava.basics;
import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age");
		
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println( "you are allowed");
		}
		else {
		System.out.println("not allowed");
	}

	}
}

