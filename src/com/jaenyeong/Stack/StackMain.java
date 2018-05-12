package com.jaenyeong.Stack;

public class StackMain {

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();

        arrayStack.push("1");
        arrayStack.push("2");
        arrayStack.push("3");

        for (int i = arrayStack.size(); i > 0; i--) {
            System.out.println("ArrayStack pop: " + arrayStack.pop());
        }

        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push("1");
        linkedListStack.push("7");
        linkedListStack.push("0");
        linkedListStack.push("3");
        linkedListStack.push("5");

        while (!linkedListStack.isEmpty()) {
            System.out.println("LinkedListStack pop: " + linkedListStack.pop());
        }

    }
}
