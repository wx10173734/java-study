package com.lzc.digui;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class digui03 {
    public static void main(String[] args) {
        int fb = fb(7);
        System.out.println(fb);
    }

    static int fb(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fb(n - 1) + fb(n - 2);
            }
        } else {
            System.out.println("要输入整数>=1");
            return -1;
        }
    }
}
