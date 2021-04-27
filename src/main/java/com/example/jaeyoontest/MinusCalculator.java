package com.example.jaeyoontest;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MinusCalculator {
    private int first;
    private int second;

    public MinusCalculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getMinusValue() {
        return first - second; // 니가 짠거
    }

    public Integer getMinusValue(Integer a, Integer b) {
        return a - b; // 니가 짠거
    }
}
