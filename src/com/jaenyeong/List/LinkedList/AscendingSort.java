package com.jaenyeong.List.LinkedList;

public class AscendingSort implements SetSortRule {

    public AscendingSort() {
    }

    @Override
    public int sort(int data1, int data2) {
        if (data1 < data2) {
            return 0;
        } else
            return 1;
    }
}
