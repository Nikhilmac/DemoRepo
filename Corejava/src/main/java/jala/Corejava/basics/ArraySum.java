package jala.Corejava.basics;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int score[]= {1,2,3,4,5};
         int sum=0;
         for(int i=0;i<score.length;i++) 
         {
        	  sum+=score[i];
         }
         int avg = sum / score.length;
	System.out.println(sum +"sum avg " + avg);
	}
	
}
