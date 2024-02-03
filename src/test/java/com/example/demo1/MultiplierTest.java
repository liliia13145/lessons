package com.example.demo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    @Test
    @DisplayName("проверка умножения двух чисел")
    void test1() {
        int val1 = 10;
        int val2 = 2;
        int expected = 20;

        Multiplier obj = new Multiplier();

        Assertions.assertEquals(expected, obj.multipty(val1, val2));
    }

}