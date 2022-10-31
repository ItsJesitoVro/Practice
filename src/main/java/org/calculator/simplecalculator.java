package org.calculator;

public class simplecalculator {

    public static int result = 0;
    public static int add(String numbers){
        //Condición si el valor de la cadena es igual a vació
        if(numbers == ""){
            result = 0;
            return result;
        //Condición si el valor ingresado solo es la cadena 1
        } if (numbers == "1"){
            result = Integer.parseInt(numbers);
            return result;
        //Condición que suma cuando 2 numeros son separados por una coma (,)
        } else {
            String[] arreglo = numbers.split(",");
            result = Integer.valueOf(arreglo[0]) + Integer.valueOf(arreglo[1]);
            return result;
        }
    }
}
