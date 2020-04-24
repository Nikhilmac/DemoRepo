package method.overloading;

public class Method131 {
	
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j,int z) {
		System.out.println(i+j+z);
	}
public static void main(String[] args) {
	Method131 obj=new Method131();
	obj.add(5,13);
	obj.add(10,20,322);
}
}
