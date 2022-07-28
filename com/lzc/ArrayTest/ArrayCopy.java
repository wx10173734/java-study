package com.lzc.ArrayTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
    }
}
