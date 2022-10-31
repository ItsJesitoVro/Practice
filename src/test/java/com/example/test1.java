package com.example;

import org.example.Practice1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test1 {
    private Practice1 practice1;

    @BeforeEach
    public void setUp() throws Exception{
        practice1 = new Practice1();
    }

    @Test
    void test_One() throws Exception{
        Practice1 practice1 = new Practice1();
        rollMay(0, 0);
        Assertions.assertEquals(0, Practice1.score());
    }
    @Test
    public void test_two() throws Exception{
        Practice1 practice1 = new Practice1();
        rollMay(20, 1);
        Assertions.assertEquals(20, Practice1.score());
    }
    private void rollMay(int n, int pins){
        for (int i=0; i<20; i++){
            Practice1.roll(pins);
        }
    }
}
