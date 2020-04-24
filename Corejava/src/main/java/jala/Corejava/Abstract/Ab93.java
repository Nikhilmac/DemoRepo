package jala.Corejava.Abstract;
abstract public class Ab93
{
public void write() {
	System.out.println("Writing");
}
public abstract void show();
public abstract void now();
}
abstract class A extends Ab93
{    
	public void demo() {
		System.out.println("demo");}	
}
abstract class B extends A
{	public void show() {
		System.out.println("moving");
	}
}
class C extends B{
	C obj=new C();
	public void now(){
		System.out.println("now read");
		}
public class Ab93{
public void main(String[] args) {
	A obj1=new C();
	obj1.demo();
			}
}}