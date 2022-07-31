package com.oop.ArrayTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        int nums[] = {4, -1, 9, 10, 23};
        int max = nums[0];
        int maxIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max =nums[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
