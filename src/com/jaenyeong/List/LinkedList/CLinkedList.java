package com.jaenyeong.List.LinkedList;

import com.jaenyeong.List.ResultData;

public class CLinkedList {
    Node tail = null;
    Node current = null;
    Node before = null;
    int numOfData = 0;

    public CLinkedList() {
    }

    boolean getFirstData(ResultData resultData) {
        if (this.tail == null) {
            return false;
        }

        this.before = this.tail;
        this.current = this.tail.nextNode;
        resultData.setResultData(this.current.data);
        return true;
    }

    boolean getNextData(ResultData resultData) {
        if (this.tail == null) {
            return false;
        }

        this.before = this.current;
        this.current = this.current.nextNode;
        resultData.setResultData(this.current.data);
        return true;
    }

    void insert(Object inputData) {
        Node newNode = new Node();
        newNode.data = inputData;

        if (this.tail == null) {
            this.tail = newNode;
            newNode.nextNode = newNode;
        } else {
            newNode.nextNode = this.tail.nextNode;
            this.tail.nextNode = newNode;
            this.tail = newNode;
        }

        this.numOfData++;
    }

    void insertFront(Object inputData) {
        Node newNode = new Node();
        newNode.data = inputData;

        if (this.tail == null) {
            this.tail = newNode;
            newNode.nextNode = newNode;
        } else {
            newNode.nextNode = this.tail.nextNode;
            this.tail.nextNode = newNode;
        }

        this.numOfData++;
    }

    Object remove() {

        Node removeNode = this.current;

        if (removeNode == this.tail) {

            if (this.tail == this.tail.nextNode) {
                this.tail = null;
            } else {
                this.tail = this.before;
            }
        }

        this.before.nextNode = this.current.nextNode;
        this.current = this.before;
        this.numOfData--;
        return removeNode;
    }

    int size() {
        return this.numOfData;
    }

}
