package com.example;

import org.example.fizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test_fizz {
    @Test
    //Prueba de numeros multiplos de 3
    void Test1() throws Exception{
        fizzBuzz fizzbuzz = new fizzBuzz();
        Assertions.assertEquals("Fizz", fizzbuzz.fizzBuzz(39));
    }
    @Test
        //Prueba de numeros multiplos de 5
    void Test2() throws Exception{
        fizzBuzz fizzBuzz = new fizzBuzz();
        Assertions.assertEquals("Buzz", fizzBuzz.fizzBuzz(40));
    }
    @Test
        //Prueba de numeros multiplos de 3 y 5
    void Test3() throws Exception{
        fizzBuzz fizzBuzz = new fizzBuzz();
        Assertions.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(75));
    }
}
