package corejavaStatic;

public class StaticDemo {
public static void main(String[] args) {
   StaticDemo obj=new StaticDemo();
	//Abc obj=new Abc();
	
	Abc.i=5;
	Abc.show();
}
}
class Abc{
	
  static int i;
public  static void show() {
	System.out.println("hello");
	System.out.println(i);
}
}
