package jala.Corejava.Collections;
 /* public boolean hasNext();
 * public boolean hasPrevious();
 * public Object Next();
 * public Object previous();*/
 import java.util.ArrayList;
import java.util.ListIterator;
public class Itertor {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("tom");
		ar.add("c++ ");
		ar.add("java ");
		ar.add("dotnet");
		ar.add("oracle");
		ar.add("seleinum");
		ar.add("JavaScript");
		//System.out.println(ar);
		ListIterator<String> lr=ar.listIterator();
		while(lr.hasNext())
		System.out.println(lr.next());
		System.out.println("");System.out.println("");
		while(lr.hasPrevious())
		System.out.println(lr.previous());
	}

}
