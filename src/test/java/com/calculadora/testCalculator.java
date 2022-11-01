package com.calculadora;

import org.calculator.simplecalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testCalculator {
    @Test
    void test1_cadena_vacia() throws Exception {
        simplecalculator simplecalculator = new simplecalculator();
        Assertions.assertEquals(0, simplecalculator.add(""));
    }
    @Test
    void test2_cadena_igual_uno() throws Exception {
        simplecalculator simplecalculator = new simplecalculator();
        Assertions.assertEquals(1, simplecalculator.add("1"));
    }
    @Test
    void test3_suma_de_2_numeros_separados_por_coma() throws Exception {
        simplecalculator simplecalculator = new simplecalculator();
        Assertions.assertEquals(6, simplecalculator.add("2,4"));
    }
    @Test
    void test4_suma_sin_rango_de_cadena_separados_por_coma() throws Exception {
        simplecalculator simplecalculator = new simplecalculator();
        Assertions.assertEquals(15, simplecalculator.add("1,2,3,4,5"));
    }
}
