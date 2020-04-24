package jala.Corejava.Inheritance;

public class ThisDemo {
	int x=45;
	String name="nikhil";
	int y=1111;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ThisDemo obj=new ThisDemo();
          obj.show();
	}
    void show() {
    	int x=78645;
    	String name="jala techie";
    	System.out.println(x+" "+name);
    	System.out.println(y);
    	System.out.println(this.x);
    }
}
