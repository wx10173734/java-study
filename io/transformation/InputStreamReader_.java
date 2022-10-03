package io.transformation;

import java.io.*;

/**
 * @title: InputStreamReader_
 * @Author luozouchen
 * @Date: 2022/10/3 20:24
 * @Version 1.0
 * 演示使用InputStreamReader_ 转换流解决中文乱码问题
 * 将字节流FileInputStream 转成字符流 InputStreamReader,指定编码gbk/uft-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";

        //1.FileInputStream 转成了InputStreamReader
        //2.指定编码 gbk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //3.把InputStreamReader 传入bufferedReader
        //BufferedReader bufferedReader = new BufferedReader(isr);

        //将2 和 3 合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        //4.读取
        String s = br.readLine();
        System.out.println(s);
        //关闭外层流
        br.close();
    }
}
