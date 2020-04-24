package jala.Corejava.basics;

import java.util.Scanner;

public class Loop33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter nums");
		int x=scan.nextInt();
		int y=scan.nextInt();
		//int x=12,y=14;
		if(x==y)
		{
			System.out.println("equal nums");
			
		}
		else if(x!=y) {
			System.out.println("Nums are not equal");
		}
	}

}
