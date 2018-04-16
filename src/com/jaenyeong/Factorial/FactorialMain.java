package com.jaenyeong.Factorial;

public class FactorialMain {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        for (int i = 0; i < 16; i++) {
            System.out.println(factorial.factorial(i));
        }
    }
}
