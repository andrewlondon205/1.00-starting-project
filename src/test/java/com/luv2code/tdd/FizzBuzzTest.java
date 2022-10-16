package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    // if number is divisible by 3, print Fizz
    // if number is divisible by 5, print Buzz
    // if number is divisible by 3 and 5, print FizzBuzz
    // if number is not divisible by 3 or 5, print the number

    @Test
    @DisplayName("Divisible By Three")
    @Order(1)
    public void testForDivisibleByThree () {
        String expected = "Fizz";
        assertEquals(expected,FizzBuzz.compute(3),"Should return Fizz");
    }

    @Test
    @DisplayName("Divisible By Five")
    @Order(2)
    public void testForDivisibleByFive () {
        String expected = "Buzz";
        assertEquals(expected,FizzBuzz.compute(5),"Should return Buzz");
    }

    @Test
    @DisplayName("Divisible By Three and Five")
    @Order(3)
    public void testForDivisibleByThreeAndFive () {
        String expected = "FizzBuzz";
        assertEquals(expected,FizzBuzz.compute(15),"Should return FizzBuzz");
    }

    @Test
    @DisplayName("Not Divisible By Three or Five")
    @Order(4)
    public void testForNotDivisibleByThreeOrFive () {
        String expected = "8";
        assertEquals(expected,FizzBuzz.compute(8),"Should return " + expected);
    }

}
