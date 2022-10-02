package io.处理流设计模式;

/**
 * @title: Test_
 * @Author luozouchen
 * @Date: 2022/10/2 21:14
 * @Version 1.0
 */
public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(10);
        bufferedReader_.readFile();
        //这次希望BufferedReader_ 多次读取字符串
        BufferedReader_ bufferedReader_1 = new BufferedReader_(new StringReader_());
        bufferedReader_1.readString(5);
    }
}
