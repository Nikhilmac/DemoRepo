package jala.Corejava.basics;

public class Swtich311 {
	public static void main(String[] args) {
		int x=198;
		switch(x%2)
		{
		case 0 :
			{
				System.out.println("even");
			}
			break;
		case 1 :
			{
				System.out.println("odd");
			}
			break;
	    default :
	    	{
	    		System.out.println("no none");
	    	}
	    	break;
		}
	}

}
