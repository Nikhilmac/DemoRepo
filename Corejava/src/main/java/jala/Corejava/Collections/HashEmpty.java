package jala.Corejava.Collections;

import java.util.HashMap;

public class HashEmpty {
	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(12,"ll");
		boolean x=hs.isEmpty();
		System.out.println(x);
		System.out.println(hs.get(12));
				}
	
}
