package io.standard;

import java.util.Scanner;

/**
 * @title: InputAndOutput
 * @Author luozouchen
 * @Date: 2022/10/3 19:46
 * @Version 1.0
 */
public class InputAndOutput {
    public static void main(String[] args) {
        // System 类的public final static InputStream in = null;
        //System.in编译类型 InputStream
        //System.in运行类型 BufferedInputStream
        //表示的是标准输入 键盘
        System.out.println(System.in.getClass());

        //1.System.out public final static PrintStream out = null;
        //编译类型 PrintStream
        //运行类型 PrintStream
        //表示标准输出 显示器
        System.out.println(System.out.getClass());


        System.out.println("hello.lzc");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next = scanner.next();
        System.out.println("next="+next);
    }
}
