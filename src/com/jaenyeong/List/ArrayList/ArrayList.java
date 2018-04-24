package com.jaenyeong.List.ArrayList;

import com.jaenyeong.List.ResultData;

public class ArrayList {
    private Object array[] = new Object[100];
    private int numOfData;
    private int curPosition;

    public ArrayList() {
        this.numOfData = 0;
        this.curPosition = -1;
    }

    boolean getFirstData(ResultData resultData) {
        if (this.numOfData == 0) {
            System.out.println("데이터 없음");
            return false;
        }
        this.curPosition = 0;
        resultData.setResultData(this.array[this.curPosition]);
        return true;
    }

    boolean getNextData(ResultData resultData) {
        if (this.curPosition >= this.numOfData - 1) {
            return false;
        }
        this.curPosition++;
        resultData.setResultData(this.array[this.curPosition]);
        return true;
    }

    void insert(String insertData) {
        if (this.numOfData >= this.array.length) {
            System.out.println("배열 초과. 데이터 삽입 불가");
            return;
        }
        this.array[this.numOfData] = insertData;
        this.numOfData++;
    }

    Object remove() {
        Object removeData = this.array[this.curPosition];

        for (int i = this.curPosition; i < this.numOfData; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.numOfData--;
        this.curPosition--;

        return removeData;
    }

    int size() {
        return this.numOfData;
    }
}
