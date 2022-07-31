package com.oop.ArrayTest;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class ArrayAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        do {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            System.out.println("输入你要添加的元素");
            int addNum = scanner.nextInt();
            newArr[newArr.length - 1] = addNum;
            arr = newArr;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            //问用户是否继续
            System.out.println("你是否要继续添加y/n");
            char key = scanner.next().charAt(0);
            if (key == 'n') {//如果输入n,就退出
                break;
            }
        } while (true);
    }
}
