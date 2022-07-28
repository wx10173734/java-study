package com.lzc.retutnTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class Exercise02 {
    public static void main(String[] args) {
        isShui(152);
    }
    static void isShui(int num){
        int bai = num/100;
        int shi = num%100/10;
        int ge = num%10;
        if (Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3) == num){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
    }
}
