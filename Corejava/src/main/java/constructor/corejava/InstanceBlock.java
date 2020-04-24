package constructor.corejava;

public class InstanceBlock {
	static int count=0;
	{
		count++;
	}
	InstanceBlock()
	{
		//System.out.println("nikhil");
	}
	InstanceBlock(int i)
	{
		
	}
	InstanceBlock(double d)
	{
		
	}
	public static void main(String[] args) {
	InstanceBlock s1=new InstanceBlock();	
	InstanceBlock s2=new InstanceBlock(78);
	InstanceBlock s3=new InstanceBlock(99.99);
	System.out.println("num of objects created = " + count);
	}
}
