package com.oop.twoDimensionalArray;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class twoDimensionalArray02 {
    public static void main(String[] args) {
        int arr[][] = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            //给每个一维数组开空间
            //如果没有给一维数组new,那么arr[i]就是null
            arr[i] = new int[i + 1];
            //遍历一维数组，并给一维数组每个元素赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
