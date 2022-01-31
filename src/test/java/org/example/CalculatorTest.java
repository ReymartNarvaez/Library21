package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

    @Test
    void addReturnSum(){
        assertThat(Calculator.add(1,2)).isEqualTo(3);
    }
}
