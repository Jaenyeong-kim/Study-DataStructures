package com.jaenyeong.List.ArrayList;

import com.jaenyeong.List.ResultData;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ResultData resultData = new ResultData("");

        System.out.println("삽입 전 " + arrayList.size() + "개");

        arrayList.insert("A");
        arrayList.insert("A");
        arrayList.insert("B");
        arrayList.insert("B");
        arrayList.insert("C");

        System.out.println("삽입 후 " + arrayList.size() + "개");

        if (arrayList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (arrayList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }
        }

        if (arrayList.getFirstData(resultData)) {

            if (resultData.getResultData().equals("A")) {
                System.out.println("A 삭제");
                arrayList.remove();
            }

            while (arrayList.getNextData(resultData)) {
                if (resultData.getResultData().equals("A")) {
                    System.out.println("A 삭제");
                    arrayList.remove();
                }
            }
        }

        System.out.println("삭제 후");
        if (arrayList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (arrayList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }
        }
    }
}

