package com.luv2code.junitdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    public void beforeEachSetup () {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    public void tearDownAfterEach () {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @Test
    public void equalsAndNotEqualsTest () {
         System.out.println("Running Test: equalsAndNotEqualsTest");
         assertEquals(6,demoUtils.add(2,4),"2+4 must be 6");
         assertNotEquals(6,demoUtils.add(1,9),"1+9 must not be 6");
    }

    @Test
    public void nullAndNotNullTest () {
        System.out.println("Running Test: nullAndNotNullTest");
        String str1 = null;
        String str2 = "ralexandria";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }
}
