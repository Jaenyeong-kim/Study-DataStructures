package com.jaenyeong.Search.BinarySearch;

public class BinarySearchMain {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultIndex;

        BinarySearch binarySearch = new BinarySearch();

        resultIndex = binarySearch.search(array, 2);

        if (resultIndex >= 0) {
            System.out.println(resultIndex + "번째 타겟 있음");
        } else {
            System.out.println("타겟 없음");
        }
    }
}
