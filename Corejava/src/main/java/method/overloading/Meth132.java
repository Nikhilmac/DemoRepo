package method.overloading;

public class Meth132 {
	
	public void add(int i,int j) {
		System.out.println(i+j);
			}
public void add(float i,float j) {
	System.out.println(i+j);
}
	public static void main(String[] args) {
		Meth132 obj=new Meth132();
		obj.add(4, 8);
		obj.add(4.5,8.5);

	}
	private void add(double d, double e) {
		// TODO Auto-generated method stub
		
	}

}
