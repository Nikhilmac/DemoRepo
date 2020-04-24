package jala.Corejava.arrays2;

public class Array46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] x= {10,20,30,40};
     int[] y=new int[4];
     //y=x;
     /*for(int i=0;i<x.length;i++)
     {
   	 y[i]=x[i]; 
     }
     x[2]=1024;*/
     
     System.arraycopy(x,1,y,0,x.length-1);
     x[2]=1313;
     
      for(int i=0;i<x.length;i++) {
    	  System.out.println(x[i]);
      }
      for(int i=0;i<y.length;i++) {
    	  System.out.println(y[i]);
      }
	}
}
