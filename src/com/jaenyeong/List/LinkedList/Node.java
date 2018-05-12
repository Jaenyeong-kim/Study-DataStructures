package com.jaenyeong.List.LinkedList;

public class Node {
    Object data;
    Node nextNode;

    public Node() {
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
