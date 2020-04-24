package jala.Corejava.Inheritance;

public class SuperObject {

	public static void main(String[] args) {
		
	B1 x=new B1();
	x.show();
	
	}}
	
	class A1
	{
		int i=45;
	}
    class B1 extends A1
    { 
    	int i=9877;
    	public void show() 
    	{
    		System.out.println(super.i);
    	}
    }

