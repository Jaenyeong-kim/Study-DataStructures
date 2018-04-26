package com.jaenyeong.List.LinkedList;

import com.jaenyeong.List.ResultData;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.setSortRule(new AscendingSort());
        ResultData resultData = new ResultData("");

        linkedList.insert(11);
        linkedList.insert(11);
        linkedList.insert(22);
        linkedList.insert(22);
        linkedList.insert(33);

        System.out.println(linkedList.size());

        if (linkedList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (linkedList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }
        }

        if (linkedList.getFirstData(resultData)) {

            if (resultData.getResultData().equals(22)) {
                System.out.println("22 삭제");
                linkedList.remove();
            }

            while (linkedList.getNextData(resultData)) {
                if (resultData.getResultData().equals(22)) {
                    System.out.println("22 삭제");
                    linkedList.remove();
                }
            }
        }

        System.out.println(linkedList.size());

        if (linkedList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (linkedList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }
        }
    }
}
