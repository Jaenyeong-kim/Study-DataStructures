package com.jaenyeong.List.LinkedList;

import com.jaenyeong.List.ResultData;

public class DoublyLinkedList {
    DoublyNode head = null;
    DoublyNode current = null;
    int numOfData = 0;

    public DoublyLinkedList() {
    }

    boolean getFirstData(ResultData resultData) {
        if (this.head == null) {
            return false;
        }

        this.current = this.head;
        resultData.setResultData(this.current.data);
        return true;
    }

    boolean getNextData(ResultData resultData) {
        if (this.current.nextNode == null) {
            return false;
        }

        this.current = this.current.nextNode;
        resultData.setResultData(this.current.data);
        return true;
    }

    boolean getPreviousData(ResultData resultData) {
        if (this.current.preNode == null) {
            return false;
        }

        this.current = this.current.preNode;
        resultData.setResultData(this.current.data);
        return true;
    }

    void insert(Object inputData) {
        DoublyNode newNode = new DoublyNode();
        newNode.data = inputData;

        newNode.nextNode = this.head;
        newNode.preNode = null;

        if (this.head != null) {
            this.head.preNode = newNode;
        }

        this.head = newNode;
        this.numOfData++;
    }

    Object remove() {
        DoublyNode removeNode = this.current;

        if (this.head != this.current) {
            removeNode.preNode.nextNode = this.current.nextNode;
            removeNode.nextNode.preNode = this.current.preNode;
            this.current = this.current.preNode;
        } else {
            removeNode.nextNode.preNode = this.current.preNode;
            this.head = this.current.nextNode;
            this.current = this.current.nextNode;
        }

        this.numOfData--;
        return removeNode;
    }

    // size
    int size() {
        return this.numOfData;
    }
}
