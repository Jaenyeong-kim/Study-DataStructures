package com.jaenyeong.Factorial;

public class Factorial {

    public Factorial() {
    }

    public int factorial(int index) {
        if (index == 0) {
            return 1;
        } else {
            return index * factorial(index - 1);
        }
    }
}
