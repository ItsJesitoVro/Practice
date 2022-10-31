package org.example;

public class fizzBuzz{
    public static String fizzBuzz(int number){
        if ((number % 3) == 0 && (number % 5) == 0){
            return "FizzBuzz";
        } if((number % 3) == 0) {
            return "Fizz";
        } if ((number % 5) == 0) {
            return "Buzz";
        } else {
            return "Numero diferente al multiplo de 3 o 5";
        }
    }
}
