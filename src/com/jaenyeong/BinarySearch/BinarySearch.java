package com.jaenyeong.BinarySearch;

public class BinarySearch {

    public BinarySearch() {
    }

    public int search(int array[], int target) {
        int first = 0;
        int last = array.length - 1;
        int middle;

        while (first <= last) {
            middle = (first + last) / 2;

            if (array[middle] == target) {
                return middle + 1;
            } else if (array[middle] > target) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }
}
