package coreja.thissuper;
class A
{
	private int x=787848454;//instance varibles outside the class
	public A(int x)//local varibles inside the class
	{
	this.x=x;//current instance
		
	}
	public void show()
	{
		System.out.println(x);
	}
}
public class ThisDemo
{
	public static void main(String[] args)
	{
		A obj=new A(0202);
		obj.show();
	}
	

}
