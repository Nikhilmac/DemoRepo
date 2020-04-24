package expections;
public class Exp147 {
	public static int demo() {
		int a=100;
	    try
	    
	     {
	    	a =a/0;
	   	return a;
	   	}
	    
		catch(Exception e)
	    {
			System.out.println("catch exception");
			System.out.println(e);
		return a;
		}
	    
	    finally
	    {
		    System.out.println("finally called");
		}
	    }
     public static void main(String[] args)
       { 
            System.out.println(demo());
	   } 

}
