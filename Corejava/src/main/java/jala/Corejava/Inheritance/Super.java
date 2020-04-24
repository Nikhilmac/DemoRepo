package jala.Corejava.Inheritance;

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BB obj = new BB();
      obj.ABC();
	}
}
class AA
{
	public void ABC() {
		System.out.println(" A abc");
	}
	
}
class BB extends AA
{
	public void ABC() {
		super.ABC();
		System.out.println("B abc");
	}
	
}