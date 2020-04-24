package jala.Corejava.basics;

public class LableLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	first:for(int i=2;i<=10;i++)
		{
		  for(int j=1;j<=10;j++)
		  {
			 if(i==7)
			 {
				 continue first;
			 }
			  System.out.println(i +"*"+j + "="+ (i*j));
		  }
		}

	}

}
