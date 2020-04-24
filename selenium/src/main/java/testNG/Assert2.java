package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 {
	
	@Test
	public void Exp(){
		System.out.println("Test Case ");
		Assert.assertEquals(12, 15);	
	}
	@Test
	public void Exp1(){
		System.out.println("Test1 Started");
		Assert.assertEquals(12, 15);	
		// hard assert is if one or single assert fails then it will not execute remaining statements....
		System.out.println("Test1 completed");
	}
	@Test
	public void Exp2(){
		System.out.println("Test2 Started ");
		Assert.assertEquals(15, 15);
		System.out.println("Test2 Completed");
	
	}
	

}
