package jala.Corejava.Interface;

interface Ab{
	void show();
	void demo();
}
class BB implements Ab{
	public void show() {
		System.out.println("showing");
	}
	public void demo() {
		System.out.println("demo now");
	}
	
}
public class Inter103 {

	public static void main(String[] args) {
		
           Ab obj=new BB();
           obj.demo();
	}

}
