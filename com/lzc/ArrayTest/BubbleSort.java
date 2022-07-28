package com.lzc.ArrayTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {24, 69, 80, 57, 13,90,1,100,-1};

        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
