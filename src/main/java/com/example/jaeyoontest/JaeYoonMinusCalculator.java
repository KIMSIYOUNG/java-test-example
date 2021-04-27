package com.example.jaeyoontest;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JaeYoonMinusCalculator {
    private final MinusCalculator minusCalculator;

    public int getMinusValue() {
        int minusValue = minusCalculator.getMinusValue();

        return minusValue * -1;
    }
}
