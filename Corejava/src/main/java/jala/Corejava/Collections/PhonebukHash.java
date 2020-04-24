package jala.Corejava.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PhonebukHash {
	public static void main(String[] args) {
		Map<String,String> book = new HashMap<String,String>();
		book.put("varun", "999");
		book.put("suresh", "135");
		book.put("mahesh", "646");
		book.put("Ramesh", "777");
		book.put("Hari", "333");
		book.put("Johny", "555");
		/*System.out.println(book);
		for(Entry x:book.entrySet()) {
			System.out.println(x);
		}*/
		//System.out.println(book.get("varun"));
		Set<String> keys=book.keySet();
		for(String xc:keys) {
			System.out.println(xc+" : " +book.get(xc));
		}
		
		
	}
	

}
