package org.epita.tp.serie4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SuiteFibonacciUTest {

    @Test
    @DisplayName("Nominal test")
    public void test_nominal_test(){

        SuiteFibonacci suiteFibonacci = new SuiteFibonacci();
        suiteFibonacci.warming();
        long result = suiteFibonacci.calculer(80);
        System.out.println(result);
        Assertions.assertThat(result).isEqualTo(23416728348467685L);
    }
}
