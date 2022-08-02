package com.test10_exercise;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class HomeWork04 {
    public static void main(String[] args) {
        new CellPhone().testWork(new Cal() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        }, 10, 8);
    }
}

interface Cal {
    public double work(double n1, double n2);
}

class CellPhone {
    public void testWork(Cal cal, double n1, double n2) {
        double result = cal.work(n1, n2);
        System.out.println("计算后的结果为" + result);
    }
}
