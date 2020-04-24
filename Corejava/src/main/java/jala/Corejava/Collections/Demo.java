package jala.Corejava.Collections;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		//System.out.println("Initial Size of al :" +ar.size());
		ar.add("nikhil");
		ar.add("java");
		ar.add("dotnet");
		ar.add("WAS");
		ar.add("Testing");
		ar.add("Database");
		ar.add("jala");
		System.out.println(ar);
		//System.out.println("Size of ar after adding Elements : "+ ar.size()+ ""+ar);
		//ar.remove(2);
		//ar.remove("WAS");
		//System.out.println("Size of ar after removing Elements : "+ ar.size()+ ""+ar);
		//Collections.reverse(ar);
		//System.out.println("reversing elements : "+ar);
		//ar.get(2);
		//ar.set(2,"pointing");
		System.out.println(	ar.get(2));
		//for(String x:ar) {
			//System.out.println(x);
		//}
	    //ar.clear();
	    //System.out.println(ar+"  "+ar.size());
	}
}


