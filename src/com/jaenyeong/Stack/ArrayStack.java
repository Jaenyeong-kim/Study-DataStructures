package com.jaenyeong.Stack;

public class ArrayStack {
    Object array[] = new Object[100];
    int topIdx = -1;
    int length = 0;

    public ArrayStack() {
    }

    boolean isEmpty() {
        if (this.topIdx == -1) {
            return true;
        }

        return false;
    }

    boolean push(Object inputData) {
        if (100 > this.array.length) {
            return false;
        }

        this.topIdx++;
        this.array[topIdx] = inputData;
        this.length++;

        return true;
    }

    Object pop() {
        if (this.isEmpty()) {
            return (-1);
        }

        int removeIdx = this.topIdx;
        this.topIdx--;
        this.length--;

        return this.array[removeIdx];
    }

    Object peek() {
        return this.array[topIdx];
    }

    int size() {
        return this.length;
    }
}
