package jala.Corejava.basics;

import java.util.Scanner;

public class ScannerArea {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter  number");
		int i=scan.nextInt();
		System.out.println("enter number");
		int j=scan.nextInt();
		
		System.out.println(" i : " + i +  " j : " + j );
		System.out.println("Addition of 2 nums :" + (i+j));
	    System.out.println("Sub of 2 num " + (i-j));
	    System.out.println("mul of 2 nums " + (i*j));
		System.out.println("div of 2 nums :" + (i/j));
	    System.out.println("Sub of 2 num " + (i-j));
	    
	}

}
