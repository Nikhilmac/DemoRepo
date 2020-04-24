package jala.Corejava.Collections;
import java.util.*;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Map.Entry;
public class HashLinkedlist {
	public static void main(String[] args) {
	         HashMap<Integer,String> hs=new HashMap<Integer,String>();
	         hs.put(1, "ajava");
	         hs.put(45,"nikhil");
	         hs.put(7, "zaggery");
	         hs.put(4,"pizza");
	         hs.put(0, "ERror");
	         System.out.println(hs);
	         LinkedList<Entry<Integer,String>> list=new LinkedList<Entry<Integer,String>>(hs.entrySet());
	         Collections.sort(list,new Comparator<Entry<Integer,String>>(){
            	public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
					// TODO Auto-generated method stub
					return arg0.getValue().compareToIgnoreCase(arg1.getValue());
				}
	         });
	         for(Entry x:list) {
	        	 	 System.out.println(x);
	         }
	         Collections.sort(list,new Comparator<Entry<Integer,String>>(){

				public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
					// TODO Auto-generated method stub
					return arg0.getKey().compareTo(arg1.getKey());
				}
	        	 
	         });
	         for(Entry y:list) {
	        	 System.out.println(y);
	         }
	         }}
