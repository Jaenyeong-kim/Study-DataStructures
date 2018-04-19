package com.jaenyeong.Search.LinearSearch;

public class LinearSearchMain {
    public static void main(String[] args) {
        int arr[] = {7,2,6,1,5};
        int resultIndex;

        LinearSearch linearSearch = new LinearSearch();
        resultIndex = linearSearch.search(arr, 5);

        if (resultIndex >= 0) {
            System.out.println(resultIndex + "번째 타겟 있음");
        } else {
            System.out.println("타겟 없음");
        }
    }
}
