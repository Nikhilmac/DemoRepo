package miscellaneous;

//package com.techbeamers.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {

    String className = "HardAssertion";

    @Test
    public void test_UsingHardAssertion() {
        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssertion", "HardAssertion");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }
}
