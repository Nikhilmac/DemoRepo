package jala.Corejava.basics;
import java.util.Scanner;
public class Methodd {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter width");
		int x=scan.nextInt();
		System.out.println("Enter Length");
		int y=scan.nextInt();
		int r=rect(x,y);
		int m=peri(x,y);
		System.out.println("AreaRectangle : " + r + " AreaPerimeter :" + m );
		System.out.println("Area of Rectangle : " + rect(5,10));
		System.out.println(peri(4,2));
	}

public static int rect(int x,int y) {
		return x*y;
	
}
public static int peri(int x,int y) {
	return 2 * (x+y);
	
}

}


