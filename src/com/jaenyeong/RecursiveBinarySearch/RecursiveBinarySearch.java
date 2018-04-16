package com.jaenyeong.RecursiveBinarySearch;

public class RecursiveBinarySearch {

    public RecursiveBinarySearch() {
    }

    public int binarySearch(int array[], int first, int last, int target) {
        int middle;

        if (first > last) {
            return -1;
        }

        middle = (first + last) / 2;

        if (array[middle] == target) {
            return middle + 1;
        } else if (array[middle] > target) {
            return binarySearch(array, first, middle - 1, target);
        } else {
            return binarySearch(array, middle + 1, last, target);
        }
    }
}
