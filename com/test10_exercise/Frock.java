package com.test10_exercise;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public static int getCurrentNum() {
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}

class testFrock {
    public static void main(String[] args) {
        int nextNum1 = Frock.getNextNum();
        int nextNum2 = Frock.getNextNum();
        System.out.println(nextNum1 + " " + nextNum2);
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());

    }
}
