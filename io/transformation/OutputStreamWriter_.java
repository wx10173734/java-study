package io.transformation;

import java.io.*;

/**
 * @title: OutputStreamWriter_
 * @Author luozouchen
 * @Date: 2022/10/3 20:33
 * @Version 1.0
 * 演示OutputStreamWriter 使用
 * 把FileOutputStream 字节流，转成字符流OutputStreamWriter
 * 指定处理的编码 gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\lzc.txt";
        String charSet = "utf-8";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), charSet));
        bufferedWriter.write("你好，罗邹晨");
        bufferedWriter.close();
        System.out.println("按照" + charSet +"保存文件成功~");
    }
}
