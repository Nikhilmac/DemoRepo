package jala.Corejava.Abstract;

public class Abstract92 {

	public static void main(String[] args) {
		books obj=new books();
		Teacher t=new students();
		t.teaches();
		
		obj.notes();
	}
}

abstract class Teacher{
	public void teaches() {
		System.out.println("Teaching concepts");
	}	
}
class students extends Teacher
{ 
	 int x=45;
		
	 public void learn() {
		System.out.println("learns");
	}
}
class books extends students{
	public void notes() {
		System.out.println("notes in books");
	}
}
