package com.lzc.ArrayTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55, 66};
        //规律反转
        //for (int i = 0; i < arr.length/2; i++) {
        //    int temp = arr[arr.length-1-i];//保存
        //    arr[arr.length-1-i]=arr[i];
        //    arr[i] = temp;
        //}
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i]);
        //}
        //逆序赋值
        int arr2[] = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
