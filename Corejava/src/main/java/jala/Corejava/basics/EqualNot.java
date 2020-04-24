package jala.Corejava.basics;

import java.util.Scanner;

public class EqualNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int x=scan.nextInt();
		System.out.println("Enter numbers");
		int y=scan.nextInt();
		//int x=5,y=5;
				
	    if(x==y) {
			System.out.println("Equal nums");
		}
		else if (x!=y)
		{
			System.out.println("Nums are not equal");
		}
		

	}

}
