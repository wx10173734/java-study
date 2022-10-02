package io.writer;

import java.io.*;

/**
 * @title: BufferedCopy_
 * @Author luozouchen
 * @Date: 2022/10/2 23:11
 * @Version 1.0
 */
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        //说明
        //1. BufferedReader 和 BufferedWriter 是安装字符操作
        //2. 不要去操作 二进制文件[声音，视频，doc, pdf ], 可能造成文件损坏
        String srcFilePath = "e:\\BufferedWriter.txt";
        String descFilePath = "d:\\BufferedWriter.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(descFilePath));
        String line;
        //说救命 readLine读取一行内容，但是没有换行
        while ((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            //插入一个换行符
            bufferedWriter.newLine();
        }
        System.out.println("拷贝完毕");
        if (bufferedReader!=null){
            bufferedReader.close();
        }
        if (bufferedWriter!=null){
            bufferedWriter.close();
        }
    }
}
