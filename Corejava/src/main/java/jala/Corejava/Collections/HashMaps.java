package jala.Corejava.Collections;
import java.util.Map;
import java.util.HashMap;

public class HashMaps {
public static void main(String[] args) {
	
	HashMap<Integer,String> hs=new HashMap<Integer,String>();
	hs.put(101,"java");
	hs.put(102,"Testing");
	hs.put(103,"selenim");
	hs.put(104,"Program");
	hs.put(105,"Arrays");
	hs.put(106,"HHHHHHH");
	hs.put(107,"mannnn");
    //System.out.println(hs);
   // System.out.println(hs.size());
    //System.out.println(hs.get(102));
	System.out.println("HashMap Program : ");
    for(Map.Entry<Integer,String> x:hs.entrySet()) {
    	//System.out.println(x);
    	int key = x.getKey(); 	
    	String value =x.getValue();
    	
    	System.out.println(key+" : "+value);
    	
    }
    

}
}
