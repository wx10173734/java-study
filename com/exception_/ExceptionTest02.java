package com.exception_;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.println("输入一个整数");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }

        }
        System.out.println("输入的值"+num);
    }
}
