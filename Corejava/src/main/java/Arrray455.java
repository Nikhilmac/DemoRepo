import java.util.Scanner;
public class Arrray455 {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		int location=0;
		System.out.println("Enter size of the Array");
		int x=c.nextInt();
		int[] a=new int[x];
		System.out.println("Enter the Number of Elements");
		for(int i=0;i<x;i++) {
			a[i]=c.nextInt();	
		}
		System.out.println("the values of the elements are :");
	for(int i=0;i<x;i++) {
		System.out.println(a[i]);
	}
	System.out.println("enter the location to delete index starts frm zero");
	location=c.nextInt();
	for(int i=location;i<=x;i++ ) {
		a[i]=a[i+1];
	}
	for(int i=0;i<x;i++) {
		System.out.println(a[i]);
	}
	
	}
	
	
	
	}

