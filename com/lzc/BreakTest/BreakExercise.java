package com.lzc.BreakTest;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class BreakExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 3;
        while (i >= 1) {
            String name = scanner.nextLine();
            String pwd = scanner.nextLine();
            if (name.equals("lzc") && pwd.equals("123456")) {
                System.out.println("登陆成功");
                break;
            } else {
                i--;
                if (i == 0) {
                    break;
                }
                System.out.println("你还有" + i + "次机会");
            }
        }
    }
}
