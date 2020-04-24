package testNG;

//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
    @Test
	public void test1(){
	   Assert.assertEquals(12, 13);
	}
    
    @Test
   	public void test2(){
   	   Assert.assertEquals(12, 13, " Nums are not equals");
    }
    
   	 @Test
    	public void test3(){
    	   Assert.assertEquals("nikhil", "nikhil", " Names are not equals");
    	}
}
    
    
    

