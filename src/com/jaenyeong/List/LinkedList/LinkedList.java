package com.jaenyeong.List.LinkedList;

import com.jaenyeong.List.ResultData;

public class LinkedList {
    Node head = new Node();
    Node current = null;
    Node before = null;
    int numOfData = 0;
    SetSortRule setSortRule;

    public LinkedList() {
        this.head.nextNode = null;
    }

    boolean getFirstData(ResultData resultData) {
        if (this.head.nextNode == null) {
            return false;
        }

        this.before = this.head;
        this.current = this.head.nextNode;
        resultData.setResultData(this.current.data);
        return true;
    }

    boolean getNextData(ResultData resultData) {
        if (this.current.nextNode == null) {
            return false;
        }

        this.before = this.current;
        this.current = this.current.nextNode;
        resultData.setResultData(this.current.data);
        return true;
    }

    void insert(Object inputData) {
        if (this.setSortRule == null) {
            this.fInsert(inputData);
        } else {
            this.sInsert(inputData);
        }
    }

    private void fInsert(Object inputData) {
        Node newNode = new Node();
        newNode.data = inputData;

        newNode.nextNode = this.head.nextNode;
        this.head.nextNode = newNode;

        this.numOfData++;
    }

    private void sInsert(Object inputData) {
        Node newNode = new Node();
        Node preNode = this.head;
        newNode.data = inputData;

        while (preNode.nextNode != null && this.setSortRule.sort((int)inputData, (int)preNode.nextNode.data) != 0) {
            preNode = preNode.nextNode;
        }

        newNode.nextNode = preNode.nextNode;
        preNode.nextNode = newNode;

        this.numOfData++;
    }

    Object remove() {
        Node removeNode = this.current;
        this.before.nextNode = this.current.nextNode;
        this.current = this.before;
        this.numOfData--;
        return removeNode;
    }

    int size() {
        return this.numOfData;
    }

    void setSortRule(SetSortRule setSortRule) {
        this.setSortRule = setSortRule;
    }
}
