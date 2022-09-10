package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMethods {

    private int value;

    @Test
    void givenNumberIsPositive1_shouldReturn() {
        Factorial factorial = new Factorial(1);
        int actual_output = factorial.Calculatevalue();
          Assertions.assertEquals(1,actual_output);  
    }

    @Test
   public void ifGivenNumberIsNegative_shouldThrowFactorialException () {
            Factorial factorial = new Factorial(-1);
                Assertions.assertThrows(FactorialException.class,factorial::Calculatevalue);


            }

    @Test
    void ifGivenNumberIs5_shouldReturn_equals() {
        Factorial factorial = new Factorial(5);
        int actual_output = factorial.Calculatevalue();
        Assertions.assertEquals(120,actual_output);
    }

    @Test
    void givennumber3_shouldReturn_equals() {
        Factorial factorial = new Factorial(3);
        int actual_output = factorial.Calculatevalue();
        Assertions.assertEquals(6,actual_output);
    }
}
    

