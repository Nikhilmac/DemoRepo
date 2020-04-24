package jala.Corejava.Collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
//HAshmap sorting
public class HashmapSort {
public static void main(String[] args) {
	HashMap<Integer,String> hs=new HashMap<Integer,String>();
	hs.put(6,"aava");
	hs.put(2,"xava");
	hs.put(1,"azva");
	hs.put(4,"Xpva");
	hs.put(5,"Adf");
	System.out.println(hs);
	LinkedList<Entry<Integer,String>> ls = new LinkedList<Entry<Integer,String>>(hs.entrySet());
	Collections.sort(ls,new Comparator<Entry<Integer,String>>(){
            public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
			return arg0.getKey().compareTo(arg1.getKey());
		}	
});
	for(Entry x:ls) {
		System.out.println(x);
	}
	
	Collections.sort(ls,new Comparator<Entry<Integer,String>>(){

		public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
			return arg0.getValue().compareTo(arg1.getValue());
		}
	});
	for(Entry y:ls) {
		System.out.println(y);
	}
}}
