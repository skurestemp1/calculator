package app;

import calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("5 + 5 = " + calculator.add(5, 5));
    }
}
