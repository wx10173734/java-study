package io.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @title: CodeQuetion
 * @Author luozouchen
 * @Date: 2022/10/3 20:01
 * @Version 1.0
 * 看一个中文乱码问题
 */
public class CodeQuetion {
    public static void main(String[] args) throws IOException {
        //读取e:\\a.txt 文件到程序
        //思路
        //1.创建字符输入流 BufferedReader[处理流]
        //2.使用BufferedReader读取a.txt文件
        //3.在默认情况下，读取文件是按照utf-8编码
        String filePath = "e:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();

    }
}
