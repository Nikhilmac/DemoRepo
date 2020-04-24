package coreja.thissuper;

public class ThisDmo {
	int x=45;        // Instance and global variables
	String name="nikhil";
   void	Demo() {
		int x=7878;             //local variables
		String name="java";
		System.out.println(x+" "+name);
		System.out.println(this.x+" "+this.name);
	}
	public static void main(String[] args) {
		ThisDmo obj=new ThisDmo();
		obj.Demo();
		
	}

}
