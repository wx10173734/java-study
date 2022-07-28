package com.lzc.ArrayTest;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class ArrayDelete {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        do {
            int newArr[] = new int[arr.length-1];
            for (int i = 0; i < arr.length-1; i++) {
                newArr[i]=arr[i];
            }
            arr = newArr;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            if (arr.length == 1){
                System.out.println("不能再缩减");
                break;
            }
        }while (true);

    }
}
