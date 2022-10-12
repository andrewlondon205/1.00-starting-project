package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    public void beforeEachSetup () {
        demoUtils = new DemoUtils();
    //    System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    @Order(1)
    public void equalsAndNotEqualsTest () {
       //  System.out.println("Running Test: equalsAndNotEqualsTest");
         assertEquals(6,demoUtils.add(2,4),"2+4 must be 6");
         assertNotEquals(6,demoUtils.add(1,9),"1+9 must not be 6");
    }

    @Test
    @DisplayName("Null and Not Null")
    @Order(0)
    public void nullAndNotNullTest () {
      //  System.out.println("Running Test: nullAndNotNullTest");
        String str1 = null;
        String str2 = "ralexandria";
        assertNull(demoUtils.checkNull(str1),"Object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }

    @Test
    @DisplayName("Same and Not Same")
    public void sameAndNotSameTest() {
        String str = "luv2code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Objects should refer to the same object");
        assertNotSame(str,demoUtils.getAcademy(),"Objects should not refer to the same object");
    }

    @Test
    @DisplayName("True and False")
    public void trueFalseTest () {
        int gradeOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradeOne,gradeTwo),"This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradeOne),"This should return true");
    }

    @Test
    @DisplayName("Array Equals")
    public void arrayEqualsTest() {
        String [] stringArray = {"A","B","C"};
        assertArrayEquals(stringArray,demoUtils.getFirstThreeLettersOfAlphabet(),"Arrays should be the same");
    }

    @Test
    @DisplayName("Iterable Equals")
    public void iterableEqualsTest () {
        List<String> theList = List.of("luv","2","code");
        assertIterableEquals(theList, demoUtils.getAcademyInList(),"Expected list should be the same as actual list");
    }

    @Test
    @DisplayName("Lines match")
    public void linesMatchTest () {
        List<String> theList = List.of("luv","2","code");
        assertLinesMatch(theList,demoUtils.getAcademyInList(),"Lines should match");
    }

    @Test
    @DisplayName("Throws and Does Not Throw")
    public void throwsAndDoesNotThrowTest () {
        assertThrows(Exception.class,() -> {demoUtils.throwException(-1);},"Should throw an exception");
        assertDoesNotThrow(()->{demoUtils.throwException(10);},"Should not throw an exception");
    }

    @Test
    @DisplayName("Timeout")
    public void timeOutTest () {
        assertTimeoutPreemptively(Duration.ofSeconds(3),() -> {demoUtils.checkTimeout();},"Method should execute within 3 seconds");
    }

/*  @AfterEach
    public void tearDownAfterEach () {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @BeforeAll
    public static void beforeEachClassSetup() {
        System.out.println("@BeforeAll executes only once before all the test methods executing in the class");
    }

    @AfterAll
    public static void teadDownAfterAll() {
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }*/
}
