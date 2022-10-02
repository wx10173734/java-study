package io.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @title: BufferedReader_
 * @Author luozouchen
 * @Date: 2022/10/2 21:44
 * @Version 1.0
 * 演示bufferedReader 使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "e:\\writer.txt";

        //创建BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取，效率高
        //说明
        //1. bufferedReader.readLine(); 是按行读取

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        //关闭流,这里注意，只需要关闭BufferedReader，因为底层会自动的关闭节点流（FileReader）
        bufferedReader.close();
        /*
        public void close() throws IOException {
            synchronized (lock) {
            if (in == null)
            return;
            try {
                in.close();//in 就是我们传入的 new FileReader(filePath), 关闭了. } finally {
                in = null;
                cb = null;
                }
            }
           }
        */


    }
}
