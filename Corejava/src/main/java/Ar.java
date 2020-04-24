import java.util.Arrays;
public class Ar {
public static void main(String[] args) {
	int[] x= {10,20,30,0,50};
	System.out.println(Arrays.toString(x));
	int removeIndex=1;
	for(int i=removeIndex;i<x.length-1;i++) {
		x[i]=x[i+1];
		
	}
	System.out.println(Arrays.toString(x));
}
}
