package com.jaenyeong.List.ArrayList;

public class ArrayList {
    private String array[] = new String[100];
    private int numOfData;
    private int curPosition;

    public ArrayList() {
        this.numOfData = 0;
        this.curPosition = -1;
    }

    public boolean getFirstData(ResultData resultData) {
        if (this.numOfData == 0) {
            System.out.println("데이터 없음");
            return false;
        }
        this.curPosition = 0;
        resultData.setResultData(this.array[this.curPosition]);
        return true;
    }

    public boolean getNextData(ResultData resultData) {
        if (this.curPosition >= this.numOfData - 1) {
            return false;
        }
        this.curPosition++;
        resultData.setResultData(this.array[this.curPosition]);
        return true;
    }

    public void insert(String insertData) {
        if (this.numOfData >= this.array.length) {
            System.out.println("배열 초과. 데이터 삽입 불가");
            return;
        }
        this.array[this.numOfData] = insertData;
//        System.out.println(this.array[this.numOfData]);
        this.numOfData++;
    }

    public String remove() {
        String removeData = this.array[this.curPosition];

        for (int i = this.curPosition; i < this.numOfData; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.numOfData--;
        this.curPosition--;

        return removeData;
    }

    public int getNumOfData() {
        return this.numOfData;
    }

}
