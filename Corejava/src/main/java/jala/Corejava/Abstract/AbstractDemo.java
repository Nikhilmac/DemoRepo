package jala.Corejava.Abstract;
public class AbstractDemo {
public static void main(String[] args) {
iphone obj=new iphone();
samsung obj1=new samsung();
show(obj1);
}
public static void show(phone obj) {
	obj.showconfig();
}}
abstract class phone{
	public abstract void showconfig();
}

class iphone extends phone
{
	public void showconfig() {
		System.out.println("2.5");
	}
}
class samsung extends phone
{
	public void showconfig() {
		System.out.println("1.2");
	}
}