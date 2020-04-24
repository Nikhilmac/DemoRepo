package jala.Corejava.arrays;

public class Array48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,50,45,99,65,4853,56};
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int num :a) {
			if(num>largest) {
				largest=num;
			}
	}
		System.out.println(largest);
		
		for(int num:a) {
			if(num<smallest) {
				smallest=num;
			}
		}
		System.out.println(smallest);
		
		
	}
}
