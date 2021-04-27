package com.example.jaeyoontest;

public class CalculatorApplication {

    public static void main(String[] args) {
        PlusCalculator calculator = new PlusCalculator(1, 3);
        MinusCalculator minusCalculator = new MinusCalculator(1, 4);
        MinusCalculator minusCalculator2 = new MinusCalculator(5, 4);

        System.out.println(calculator.getPlusValue());
        System.out.println(minusCalculator.getMinusValue());

        System.out.println(minusCalculator2.getMinusValue());
    }
}
