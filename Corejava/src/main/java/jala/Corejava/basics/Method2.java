package jala.Corejava.basics;

public class Method2 {
	
	public static void main(String[] args) {
		System.out.println(areaRectangle(5,4));
		
		/* here we pass
		arguements to get the better results */
		
		System.out.println(areaPerimeter(3,5));
		
	}
	
	public static int areaRectangle(int x,int y)// pass parameters
	
	{
	return x*y;
	}
	
	public static int areaPerimeter(int x , int y) //pass parameters
	
	{
		return 2*(x+y);
		
	}
	

}
