package jala.Corejava.Abstract;

public class Abstract91 {
public static void main(String[] args) {
	//Maheshph obj=new Maheshph();//cannot instantiate the abstract class 
	Sureshph obj=new Sureshph();
	obj.call();
	obj.move();
	obj.dance();
	obj.sing();
}
}
abstract class Maheshph{   // abstract class
	public void call() {
	System.out.println("calling.......");
	}
	public abstract void dance();//abstract methods...
	public abstract void move();
	public abstract void sing();
}
abstract class Rameshph extends Maheshph{
	public void dance() {
		System.out.println("dancing");
	}	}
class Sureshph extends Rameshph{  // concrete class
	public void move() {
		System.out.println("moving");}
	public void sing() {
		System.out.println("singing");
	}
}

