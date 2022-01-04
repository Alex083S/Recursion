package com.company.generics.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Double num1 = 3.7;
        Integer num2 = 9;
        System.out.println(Calculator.sum(num1, num2));
        System.out.println(Calculator.subtraction(num1, num2));
        System.out.println(Calculator.multiply(num1, num2));
        System.out.println(Calculator.divide(num1, num2));
    }
}
