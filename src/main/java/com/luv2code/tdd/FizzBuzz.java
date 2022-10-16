package com.luv2code.tdd;

public class FizzBuzz {

    // if number is divisible by 3, print Fizz
    // if number is divisible by 5, print Buzz
    // if number is divisible by 3 and 5, print FizzBuzz
    // if number is not divisible by 3 or 5, print the number

    public static String compute (int i) {
        return i % 3 == 0 && i % 5 == 0 ? "FizzBuzz": i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz"  : String.valueOf(i) ;
    }



}
