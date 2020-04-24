package testNG;

import org.testng.annotations.Test;

public class Innvocation {
    @Test (invocationCount=5)
    public void runMultipleTimes(){
        System.out.println("run this test");
    }
}
