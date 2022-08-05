package com.date;

import java.util.Arrays;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Han Shun Ping";
        printName(name);
    }
    public static void printName(String str){
        if (str == null){
            System.out.println("str不能为空");
            return;
        }
        String[] name = str.split(" ");
        if (name.length !=3){
            System.out.println("输入的字符串格式不对 ");
            return;
        }
        String format = String.format("%s,%s .%c", name[2], name[0], name[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
