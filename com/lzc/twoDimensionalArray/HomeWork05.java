package com.lzc.twoDimensionalArray;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class HomeWork05 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100)+1;
        }
        for (int i = arr.length-1; i >0; i--) {
            System.out.println(arr[i]);
        }
    }
}
