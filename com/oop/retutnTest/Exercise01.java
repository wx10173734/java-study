package com.oop.retutnTest;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class Exercise01 {
    public static void main(String[] args) {
        double money = 100000;
        int count =0;
        int rcount=0;
        int sumcount;
        while (money>1000){
            if (money>50000){
                money = money*(1-0.05);
                count++;
            }else{
                money = money-1000;
                rcount++;
            }
        }
        sumcount = count+rcount;
        System.out.println(sumcount);
    }
}
