package jala.Corejava.Interface;

interface abc{
	void enjoy();
}
interface abcd extends abc{
	void rest();
}


public class Inter107 implements abc{
	public void enjoy() {
		System.out.println("enjoying");
	}
	public void rest() {
		System.out.println("resting");
	}

	public static void main(String[] args) {
		Inter107 obj=new Inter107();
		obj.enjoy();
		obj.rest();
		
	}

}
