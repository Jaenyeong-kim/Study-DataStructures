package com.jaenyeong.HanoiTower;

public class HanoiTower {

    public HanoiTower() {
    }

    public void move(int index, char from, char by, char to) {

        if (index == 1) {
            System.out.printf("원반 (1) %c에서 %c로 이동\n", from, to);
        } else {
            move(index - 1, from, to, by);
            System.out.printf("원반 (%d) %c에서 %c로 이동\n", index, from, to);
            move(index - 1, by, from, to);
        }
    }
}
