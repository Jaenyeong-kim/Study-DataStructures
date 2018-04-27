package com.jaenyeong.List.LinkedList;

import com.jaenyeong.List.ResultData;

public class DoublyLinkedListMain {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        ResultData resultData = new ResultData("");

        doublyLinkedList.insert(1);
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(5);
        doublyLinkedList.insert(6);
        doublyLinkedList.insert(7);
        doublyLinkedList.insert(8);

        if (doublyLinkedList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (doublyLinkedList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }

            while (doublyLinkedList.getPreviousData(resultData)) {
                System.out.println(resultData.getResultData());
            }
        }

        System.out.println("길이 " + doublyLinkedList.size());

        if (doublyLinkedList.getFirstData(resultData)) {
            if ((int) resultData.getResultData() % 2 == 0) {
                System.out.println(resultData.getResultData() + "삭제");
                doublyLinkedList.remove();
            }

            while (doublyLinkedList.getNextData(resultData)) {
                if ((int) resultData.getResultData() % 2 == 0) {
                    System.out.println(resultData.getResultData() + "삭제");
                    doublyLinkedList.remove();
                }
            }
        }

        if (doublyLinkedList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (doublyLinkedList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }

            while (doublyLinkedList.getPreviousData(resultData)) {
                System.out.println(resultData.getResultData());
            }

            System.out.println("길이 " + doublyLinkedList.size());
        }
    }

}
