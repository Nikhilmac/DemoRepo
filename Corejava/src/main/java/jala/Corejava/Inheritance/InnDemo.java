package jala.Corejava.Inheritance;

public class InnDemo {
public static void main(String[] args) {
	vryadv x=new vryadv();
	int result =x.add(5, 6);
	int result1 =x.sub(100,85);
	int result2 =x.mul(9,8);

	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	
}
}
class cal
{
	public int add(int a, int b) 
	{
		return a+b;
		
	}
}
class advcal extends cal
{
	public int sub(int a,int b)
	{
		return a-b;
	}
	
}
class vryadv extends advcal{
	public int mul(int a,int b) {
		return a*b;
	}
}
