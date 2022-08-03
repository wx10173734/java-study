package com.exception_;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class NumberFormatException {
    public static void main(String[] args) {
        String name="罗邹晨";
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}
