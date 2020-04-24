package jala.Corejava.Interface;

interface man{
	void show();
}
interface boy{
	void demo();
}
class aa implements man,boy{
	public void show() {
		System.out.println("showing");
	}
	public void demo() {
		System.out.println("demo read");
	}
}
public class Inter104 {

	public static void main(String[] args) {
	man obj=new aa();
	boy obj1=new aa();
	obj.show();
	obj1.demo();
	
	
	}
	
}
