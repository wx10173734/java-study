package io.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @title: PrintWriter_
 * @Author luozouchen
 * @Date: 2022/10/3 20:58
 * @Version 1.0
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("e:\\f2.txt"));
        printWriter.print("hi,你好");
        printWriter.close();//flush + 关闭流，才会将数据写入到文件
    }
}
