package com.exception_;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class HomeWork01 {
    public static void main(String[] args) {
        try {
            //先验证输入的参数的个数是否正确， 两个参数
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //转成整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);//该方法可能抛出算术异常
            System.out.println("输出结果" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (java.lang.NumberFormatException e) {
            System.out.println("参数格式不对，需要输出整数");
        } catch (ArithmeticException e) {
            System.out.println("出现除0异常");
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}

