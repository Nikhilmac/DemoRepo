package jala.Corejava.arrays;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n=s.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		for(int i:array) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
