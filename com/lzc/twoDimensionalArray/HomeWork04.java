package com.lzc.twoDimensionalArray;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class HomeWork04 {
    public static void main(String[] args) {
        //int arr[] = {10, 12, 45, 90};
        //int insertNum = 23;
        //int index = -1;//index是要插入的位置
        ////遍历arr数组 如果发现insertNum<=arr[i]; 说明i就是要插入的位置
        //for (int i = 0; i < arr.length; i++) {
        //    if (insertNum < arr[i]) {
        //        index = i;
        //        break;
        //    }
        //}
        //if (index == -1) {//说明没有找到位置
        //    index = arr.length;
        //}
        ////扩容
        ////先创建一个新的数组
        //int[] newArr = new int[arr.length + 1];
        ////把arr元素拷贝到arrNew,并且要跳过index位置
        ////i指向新数组
        //for (int i = 0, j = 0; i < newArr.length; i++) {
        //    if (i != index) {//说明可以把arr元素拷贝到newArr
        //        newArr[i] = arr[j];
        //        j++;
        //    } else {//这个位置就是要插入的数
        //        newArr[i] = insertNum;
        //    }
        //}
        //arr = newArr;
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i]);
        //}
        int arr[] = {10, 12, 45, 90};
        int index = -1;
        int insertNum = 23;
        for (int i = 0; i < arr.length; i++) {
            if (insertNum < arr[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = arr.length;
        }
        int arrNew[] = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != index) {
                arrNew[i] = arr[j];
                j++;
            } else {
                arrNew[i] = insertNum;
            }
        }
        arr = arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
