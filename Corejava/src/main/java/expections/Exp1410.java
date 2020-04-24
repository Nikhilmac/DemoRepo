package expections;

public class Exp1410 {
public static void main(String[] args) {
	
	try
	
	{
	Class.forName("nikhil.demo");	
	}
	
	catch(Exception e)
	
	{
		System.out.println("class is not there  =  "+ e);
		
	}
	
	System.out.println("Nikhil");
}

}
