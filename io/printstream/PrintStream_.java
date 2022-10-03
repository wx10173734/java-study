package io.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @title: PrintStream_
 * @Author luozouchen
 * @Date: 2022/10/3 20:48
 * @Version 1.0
 * 演示PrintStream （字节打印流/输出流）
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
         /*
            public void print(String s) {
            if (s == null)
            s = "null";
            }
            write(s);
            }
         */
        out.println("john,hello");
        //因为 print 底层使用的是 write , 所以我们可以直接调用 write 进行打印/输出
        out.write("lzc,你好".getBytes());
        out.close();
        //我们可以去修改打印流输出的位置/设备
        //我们可以去修改打印流输出的位置/设备
        //1. 输出修改成到 "e:\\f1.txt"
        //2. "hello, 韩顺平教育~" 就会输出到 e:\f1.txt
        //3. public static void setOut(PrintStream out) {
        // checkIO();
        // setOut0(out); // native 方法，修改了 out
        //修改成到 e:\f1.txt
        System.setOut(new PrintStream("e:\\f1.txt"));
        //输出到 e:\f1.txt
        System.out.println("hello,lzc");
    }
}
