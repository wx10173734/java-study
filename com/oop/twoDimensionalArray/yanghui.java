package com.oop.twoDimensionalArray;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class yanghui {
    public static void main(String[] args) {
        int arr[][] = new int[10][];
        int i, j = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
