package jala.Corejava.arrays;
import java.util.Scanner;

public class Array49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		int x=s.nextInt();
		int a[]=new int[x];
		System.out.println("enter array elements");
		for(int i=0;i<x;i++) {
			a[i]=s.nextInt();
			}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		
		

	}

}
