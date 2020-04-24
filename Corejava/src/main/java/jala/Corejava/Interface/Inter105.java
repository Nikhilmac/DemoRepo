package jala.Corejava.Interface;
interface mann
{
	void show();
}
interface boyy
{
	void show();
}

public class Inter105 implements mann,boyy {

	public void show() {
		System.out.println("20");
	}
	public static void main(String[] args) {
		
		Inter105 obj=new Inter105();
		obj.show();		
	}

}
