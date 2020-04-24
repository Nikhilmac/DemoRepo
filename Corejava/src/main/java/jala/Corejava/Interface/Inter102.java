package jala.Corejava.Interface;

interface Demo{
	void read();
	void write();
}
class A implements Demo{
	public void read() {
		System.out.println("reading");
	}
	public void write() {
		System.out.println("writing");
	}
}



public class Inter102 {

	public static void main(String[] args) {
		
		Demo obj=new A();
		obj.read();
		obj.write();
			}
}
