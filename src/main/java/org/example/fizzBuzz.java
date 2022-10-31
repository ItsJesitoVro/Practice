package org.example;

public class fizzBuzz{
    public static String fizzBuzz(int number){
        //Condición si el numero ingresado es multiplo del numero 3 y del 5 simultanemente
        if ((number % 3) == 0 && (number % 5) == 0){
            return "FizzBuzz";
        //Condición si el numero ingresado es multiplo del numero 3
        } if((number % 3) == 0) {
            return "Fizz";
        //Condición si el numero ingresado es multiplo del numero 5
        } if ((number % 5) == 0) {
            return "Buzz";
        //Mensaje si el numero no es multiplo de 3 o 5
        } else {
            return "Numero diferente al multiplo de 3 o 5";
        }
    }
}
