package jala.Corejava.basics;

public class NewMethod {
	public static void main(String[] args) {
	jalaTechie();
	jalaTech(" java ");
	int x= jala();
	System.out.println(x);
	int r=square(5);
	System.out.println(r);
	}
	public static void jalaTechie()
	{
			System.out.println("im new student");
	}
	
	public static void jalaTech(String name)
	{
		System.out.println("hello " + name);
	}
	public static  int jala()
	{
	return 2;		
	}
	public static int square(int x) 
	{
		return x*x;	
	}
	}
	

