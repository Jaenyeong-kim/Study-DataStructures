package com.jaenyeong.Stack;

import com.jaenyeong.List.LinkedList.Node;

public class LinkedListStack {
    Node head = null;
    int topIdx = -1;
    int length = 0;

    public LinkedListStack() {
    }

    boolean isEmpty() {
        if (this.topIdx == -1) {
            return true;
        }

        return false;
    }

    boolean push(Object inputData) {
        Node newNode = new Node();
        newNode.setData(inputData);

        newNode.setNextNode(this.head);
        this.head = newNode;

        this.length++;
        this.topIdx++;

        return true;
    }

    Object pop() {
        if (isEmpty()) {
            return -1;
        }

        Object removeData = this.head.getData();
        this.head = this.head.getNextNode();
        this.length--;
        this.topIdx--;

        return removeData;
    }

    Object peek() {
        if (isEmpty()) {
            return -1;
        }

        return this.head.getData();
    }

}
