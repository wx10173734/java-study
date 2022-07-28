package com.lzc.mulForTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class MulForExercise02 {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
