package com.jaenyeong.Fibonacci;

public class FibonacciMain {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i < 16; i++) {
            System.out.println(fibonacci.fibonacci(i));
        }
    }
}
