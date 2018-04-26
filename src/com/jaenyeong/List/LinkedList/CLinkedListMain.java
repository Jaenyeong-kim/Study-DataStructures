package com.jaenyeong.List.LinkedList;

import com.jaenyeong.List.ResultData;

public class CLinkedListMain {

    public static void main(String[] args) {
        CLinkedList cLinkedList = new CLinkedList();
        ResultData resultData = new ResultData("");

        cLinkedList.insert(3);
        cLinkedList.insert(4);
        cLinkedList.insert(5);
        cLinkedList.insertFront(2);
        cLinkedList.insertFront(1);

        if (cLinkedList.getFirstData(resultData)) {
            System.out.println("First " + resultData.getResultData());

            for (int i = 0; i < cLinkedList.size() * 3 - 1; i++) {
                if (cLinkedList.getNextData(resultData)) {
                    System.out.println("Next " + resultData.getResultData());
                }
            }

        }

        int nodeCnt = cLinkedList.size();
        if (nodeCnt != 0) {
            cLinkedList.getFirstData(resultData);

            if ((int)(resultData.getResultData()) %2 == 0) {
                System.out.println("%2 삭제");
                cLinkedList.remove();
            }

            for (int i = 0; i < nodeCnt-1; i++) {
                cLinkedList.getNextData(resultData);
                if ((int)(resultData.getResultData()) %2 == 0) {
                    System.out.println("%2 삭제");
                    cLinkedList.remove();
                }
            }
        }

        if (cLinkedList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            for (int i = 0; i < cLinkedList.size()-1; i++) {
                if (cLinkedList.getNextData(resultData)) {
                    System.out.println(resultData.getResultData());
                }
            }
        }
    }
}
