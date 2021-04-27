package com.example.jaeyoontest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JaeYoonMinusCalculatorTest {

    @Test
    void 두개의_숫자를_넣으면_빼기된_결과를_반환한다() {
        JaeYoonMinusCalculator minusCalculator = new JaeYoonMinusCalculator(new MinusCalculator(1, 4));

        int minusValue = minusCalculator.getMinusValue();

        assertThat(minusValue).isEqualTo(3);
    }

    @Test
    void 두개의_숫자를_넣으면_빼기된_결과를_반환한다2() {
        JaeYoonMinusCalculator minusCalculator = new JaeYoonMinusCalculator(new MinusCalculator(5, 3));

        int minusValue = minusCalculator.getMinusValue();

        assertThat(minusValue).isEqualTo(-2);
    }
}