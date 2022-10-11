package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {

    @Test
    public void equalsAndNotEqualsTest () {
         System.out.println("Running Test: equalsAndNotEqualsTest");
         DemoUtils demoUtils = new DemoUtils();
         assertEquals(6,demoUtils.add(2,4),"2+4 must be 6");
         assertNotEquals(6,demoUtils.add(1,9),"1+9 must not be 6");
    }

    @Test
    public void nullAndNotNullTest () {
        System.out.println("Running Test: nullAndNotNullTest");
        DemoUtils demoUtils = new DemoUtils();
        String str1 = null;
        String str2 = "ralexandria";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }
}
