package testNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert3 {
     @Test
       public void demo1() {
    	 Assert.assertTrue(true);}
     @Test
     public void demo2() {
  	 Assert.assertTrue(false);}
     @Test
     public void demo3()
     {
    	 String name="Nikhil Rathode"; 
  	     Assert.assertTrue(name.contains("Nikhil12")," Names are not Matching");
  	 }
     
}
