package jala.Corejava.arrays2;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Num of frdz u want to enter");
		length=sc.nextInt();
		String[] a=new String[length];
		for(int i=0;i<length;i++) 
		{
			System.out.println("Enter the frdz name:"+(i+1));
			a[i]=sc.next();
		}
	}

}
