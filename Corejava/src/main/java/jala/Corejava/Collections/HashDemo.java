package jala.Corejava.Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> ab=new HashMap<Integer,String>();
		ab.put(01,"Rama");
		ab.put(02,"Laxman");
		ab.put(03,"Surya");
		ab.put(04,"VArun");
		//System.out.println(ab);
		HashMap<Integer,String> ab2=new HashMap<Integer,String>();
		ab2.put(05,"MAnoj");
		ab2.put(06,"VArsh");
		//System.out.println(ab2);
		ab2.putAll(ab);
		System.out.println(ab2);
		System.out.println(" ");//System.out.println(" ");
		for(Entry x:ab2.entrySet()) {
		System.out.println(x.getKey()+" : "+x.getValue());
			}
	}
}
