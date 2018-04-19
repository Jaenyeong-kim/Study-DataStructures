package com.jaenyeong.Recursion.Fibonacci;

public class Fibonacci {

    public Fibonacci() {
    }

    public int fibonacci(int index) {
        if (index <= 1) {
            return 0;
        } else if (index == 2) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
}
