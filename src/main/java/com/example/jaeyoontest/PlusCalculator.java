package com.example.jaeyoontest;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlusCalculator {
    private final int first;
    private final int second;

    public int getPlusValue() {
        return first + second;
    }
}
