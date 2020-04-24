package expections;
public class Exp144 {
	public static void main(String[] args) {
		
		try
		
		{
		int[] a=new int[2];
		//int x=45/0;
	//	System.out.println(x);
        System.out.println(a[4]);
	     }
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e) 
		{
			System.out.println("out of memory  =  " +e);
		}
		System.out.println("nikhil");
			
		}

}
