package com.exception_;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "aa";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (java.lang.NumberFormatException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally被执行");
        }
        System.out.println("继续");
    }
}
