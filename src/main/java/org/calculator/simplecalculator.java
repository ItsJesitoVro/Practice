package org.calculator;

public class simplecalculator {

    public static int result;
    public static int add(String numbers){
        result = 0;
        String[] arreglo = numbers.split(",");
        //Condición si el valor de la cadena es igual a vació
        if(numbers == ""){
            result = 0;
            return result;
        }
        //Condición si el valor ingresado solo es la cadena 1
        if (numbers == "1"){
            result = Integer.parseInt(numbers);
            return result;
        }
        //Condición de suma solo cuando hay 2 numeros y son separados por una coma (,)
        if(arreglo.length == 2){
            result = Integer.valueOf(arreglo[0]) + Integer.valueOf(arreglo[1]);
            return result;
        }
        //Condición de suma sin importar la longitud de la cadena
        if(arreglo.length > 2) {
            for (int i = 0; i < arreglo.length; i++) {
                result = Integer.valueOf(arreglo[i]) + result;
            }
            return result;
        }
        return 0;
    }
}
