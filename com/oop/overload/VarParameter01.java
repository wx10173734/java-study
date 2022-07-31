package com.oop.overload;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class VarParameter01 {
    public static void main(String[] args) {
        int sum = sum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }
    static int sum(int ...nums){
        System.out.println("接口的参数个数"+nums.length);
        int res =0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}
