package com.oop.digui;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class digui01 {
    public static void main(String[] args) {
        new T().test(5);
    }
}
class T{
    public void test(int n){
        if (n>2){
            test(n-1);
        }else {
            System.out.println("n="+n);

        }
    }
}
