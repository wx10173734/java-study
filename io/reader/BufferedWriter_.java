package io.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @title: BufferedWriter_
 * @Author luozouchen
 * @Date: 2022/10/2 21:54
 * @Version 1.0
 * 演示bufferedWriter使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath="e:\\BufferedWriter.txt";
        //创建BufferedWriter
        //说明
        //1.new FileWriter (filePath,true) 表示以追加的方式写入
        //2.new FileWriter (filePath) 表示以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello1,罗邹晨");
        bufferedWriter.newLine();//插入一个和系统相关的换行
        bufferedWriter.write("hello2,罗邹晨");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3,罗邹晨");
        //插入一个换行
        bufferedWriter.newLine();
        //说明:关闭外层流即可，传入的new FileWriter(filePath),会在底层关闭
        bufferedWriter.close();
    }
}
