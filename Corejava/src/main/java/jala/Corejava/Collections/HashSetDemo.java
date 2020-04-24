package jala.Corejava.Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
	    hs.add("nikhil");
	    hs.add("akhil");
	    hs.add("java");
	    System.out.println(hs);
	    ArrayList<String> al=new ArrayList<String>();
	    al.add("nikhil");
	    al.add("java");
	    System.out.println(al); 
	    /*containsall  tells that all the elements in araylist 
	     are present in hashset*/
	   boolean  b= hs.containsAll(al);
	   System.out.println(b);		
	}
}
