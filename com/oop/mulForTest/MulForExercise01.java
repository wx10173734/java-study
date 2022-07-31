package com.oop.mulForTest;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class MulForExercise01 {
    public static void main(String[] args) {
        double sum = 0;
        double Msum = 0;
        Scanner sc = new Scanner(System.in);
        double score = 0;
        for (int i = 1; i <= 3; i++) {
            sum = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("输入第" + i + "个班级，第" + j + "名同学的成绩");
                score = sc.nextDouble();
                sum += score;
            }
            System.out.println("第" + i + "个班级的平均分为" + sum / 5);
            Msum += sum;
        }
        System.out.println("所有班级的平均分为" + Msum / 15);
    }
}
