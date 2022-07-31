package com.oop.smallchanagesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        //定义相关的变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        /**
         * 完成零钱通明细
         * 思路：
         * 1.把收益和消费，保存到数组
         * 2.使用对象
         * 3.简单的话使用String拼接
         */
        String details = "--------零钱通明细---------";
        /**
         * 完成收益入账
         * 思路：定义变量
         */
        double money = 0;
        double balance = 0;
        /**
         * 消费
         * 定义新变量，保存消费的原因
         */
        String note = "";
        Date date = null;//data是java.util.Date类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do {
            System.out.println("\n\n\n===========零钱通菜单===========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请选择（1-4）：");
            key = scanner.next();
            //使用Swith 分支
            switch (key) {
                case "1":
                    System.out.println("1 零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    //money的值范围应该校验-》一会再完善
                    //找出不正确的金额条件，然后给出提示，就直接break
                    if (money <= 0) {
                        System.out.println("收益入账金额范围需要大于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date();//获取当前的日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应该在0-" + balance);
                        break;
                    }
                    balance -= money;
                    System.out.println("消费说明");
                    note = scanner.next();
                    details += "\n消费\t" + money + "\t" + sdf.format(date) + "\t" + balance + "\t" + note;
                    break;
                case "4":
                    String choice = "";
                    while (true) {
                        System.out.println("确定退出？y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    //当用户退出while，进行判断
                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
        System.out.println("-------退出了零钱通项目");
    }
}
