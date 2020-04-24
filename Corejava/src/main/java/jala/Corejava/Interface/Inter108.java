package jala.Corejava.Interface;

interface man5
{
	 static final int x=78;
	final String cc="java";
	String zz="mikjl";
	public void show();
}

class see implements man5
{
	public void show()
	{
		System.out.println("now B");
	}
}

public class Inter108
{

	public static void main(String[] args)
   {
		man5 obj=new see();
		obj.show();
		System.out.println(obj.x);
	}

}
