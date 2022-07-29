package com.lzc.digui;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class digui04 {
    public static void main(String[] args) {
        int day =1;
        int peachNum = get(day);
        System.out.println("第"+day+"天有"+peachNum+"个桃子");
    }

    static int get(int day) {
        if (day == 10) {//第十天只有一个桃了
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (get(day + 1)+1) *2;
        }else {
            System.out.println("day在1-10内");
            return -1;
        }
    }
}
