package com.jaenyeong.List.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        ResultData resultData = new ResultData("");

        System.out.println(arrayList.getNumOfData());

        arrayList.insert("A");
        arrayList.insert("A");
        arrayList.insert("B");
        arrayList.insert("B");
        arrayList.insert("C");

        System.out.println(arrayList.getNumOfData());

        if (arrayList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (arrayList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }
        }

        if (arrayList.getFirstData(resultData)) {

            if (resultData.getResultData().equals("A")) {
                arrayList.remove();
            }

            while (arrayList.getNextData(resultData)) {
                if (resultData.getResultData().equals("A")) {
                    arrayList.remove();
                }
            }
        }

        if (arrayList.getFirstData(resultData)) {
            System.out.println(resultData.getResultData());

            while (arrayList.getNextData(resultData)) {
                System.out.println(resultData.getResultData());
            }
        }
    }
}

class ResultData {
    String resultData;

    public ResultData(String resultData) {
        this.resultData = resultData;
    }

    public void setResultData(String resultData) {
        this.resultData = resultData;
    }

    public String getResultData() {
        return this.resultData;
    }

}
