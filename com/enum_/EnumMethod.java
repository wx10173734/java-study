package com.enum_;
/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */

import java.sql.SQLOutput;

/**
 * 演示enum类的各种方法
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        //ordinal()输出的是枚举对象的次序，从0开始编号
        System.out.println(autumn.ordinal());
        Season2[] values = Season2.values();
        for (Season2 season : values) {
            System.out.println(season);
        }
        //valueOf 将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程
        //1.根据输入的AUTUMN,到season2的枚举对象去查找
        //2.如果找到了，就返回，如果没有找到，就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        System.out.println(autumn == autumn1);

        //compareto 比较的是两个枚举常量的编号 结果为两个编号相减
        System.out.println(Season2.SPRING.compareTo(Season2.WINTER));
    }
}

