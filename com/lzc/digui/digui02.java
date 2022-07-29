package com.lzc.digui;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class digui02 {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial+" ");
    }

    //阶乘
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}

