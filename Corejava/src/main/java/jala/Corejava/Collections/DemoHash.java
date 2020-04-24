package jala.Corejava.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoHash {
public static void main(String[] args) {
	/*HashMap<Integer,String> ab=new HashMap<Integer,String>();
	ab.put(01,"Rama");
	ab.put(02,"Laxman");
	ab.put(03,"Surya");
	ab.put(04,"VArun");
	ab.put(05,"MAnoj");
	ab.put(06,"VArsh");
	ab.put(07,"Subash");
	System.out.println(ab);
   for(Entry x:ab.entrySet()) //for(Map.Entry<Integer,String> x:ab.entrySet())
   {
		System.out.println(x.getKey()+" : "+x.getValue());
   }
	//ab.remove(02);
	//System.out.println(ab);*/
   HashMap<Integer,Employee> em=new HashMap<Integer,Employee>();
   Employee e1=new Employee("tom",22,"Testing");
   Employee e2=new Employee("HAri",24,"DBA");
   Employee e3=new Employee("Sonu",25,"Tomcat");
   em.put(1,e1);
   em.put(2,e2);
   em.put(3,e3);
   for(Entry ac:em.entrySet()) {
	   System.out.println(ac.getKey());
	  }
   
   
   
   
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
}
