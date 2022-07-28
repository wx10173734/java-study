package com.lzc.mulForTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class Stars {
    public static void main(String[] args) {
        int row =5;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //再打印一个倒三角
        for(int a = 4;a > 0;a--){
            //打印空格
            for(int c = 1;c <= 5 - a;c++){
                System.out.print(" ");
            }
            for(int b = 1;b <= 2 * a -1;b++){
                if( b ==1 || b == 2 * a -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}
