package jala.Corejava.Interface;
interface jala{
	void show();
}

public class Inter106 implements jala 
{
	public void show() {
		System.out.println("showing");
	}
public static void main(String[] args) {
	
	Inter106 obj=new Inter106();
	obj.show();
		
	}

}
