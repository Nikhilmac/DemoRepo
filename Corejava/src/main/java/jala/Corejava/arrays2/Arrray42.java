package jala.Corejava.arrays2;

public class Arrray42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x= {10,20,30};
		int sum=0;int avg;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		avg=sum/x.length;
		System.out.println(sum+" = SUM "+"  |  "+"AVG = "+avg);
		}
	}


