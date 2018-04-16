package com.jaenyeong.RecursiveBinarySearch;

import com.jaenyeong.BinarySearch.BinarySearch;

public class RecursiveBinarySearchMain {

    public static void main(String[] args) {
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultIndex;

        resultIndex = recursiveBinarySearch.binarySearch(array, 0, array.length - 1, 8);

        if (resultIndex >= 0) {
            System.out.println(resultIndex + "번째 타겟 있음");
        } else {
            System.out.println("타겟 없음");
        }
    }
}
