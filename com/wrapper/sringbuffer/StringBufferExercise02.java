package com.wrapper.sringbuffer;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        System.out.println("输入商品名 和 商品价格");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String price = scanner.next();
        StringBuffer sb = new StringBuffer(price);
        //先完成一个最简单的实现123,456,59
        //先找到小数点的索引，然后在该位置的前3为插入,即可
        for (int i = sb.lastIndexOf(".")-3; i>0 ;i-=3) {
            sb  = sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
