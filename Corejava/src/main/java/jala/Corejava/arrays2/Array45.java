package jala.Corejava.arrays2;
import java.util.Scanner;


public class Array45 {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[] a=new int[5];
	int location=0;
	int max=4;
	System.out.println("Emter number of Elements");
	for(int i=0;i<=max;i++) {
		a[i]=s.nextInt();
		}
		System.out.println("values in Arrays are as followiing");
	for(int i=0;i<=max;i++) {
		System.out.println(a[i]);
	}
  System.out.println("Enter the location to delete where index begins with (0)zero");
  location=s.nextInt();
  for(int i=location;i<max;i++)
  {
	  a[i]=a[i+1];
  }
  System.out.println("values in  array after deleting");
  for(int i=0;i<max;i++) {
	  System.out.println(a[i]);
  }
  
  }
  
  
  
  
}
