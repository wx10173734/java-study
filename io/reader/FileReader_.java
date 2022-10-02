package io.reader;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @title: FileReader_
 * @Author luozouchen
 * @Date: 2022/10/2 16:06
 * @Version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {


    }

    /**
     *
     */
    @Test
    public void t1() {
        String filePath = "e:\\a.txt";
        //1.创建FileReader对象
        FileReader fileReader = null;
        char[] buf = new char[8];
        int readLen = 0;
        try {
            fileReader = new FileReader(filePath);
            //循环读取，使用read(buf) 返回的是实际读取到的字符数
            //如果返回-1说明到文件结束
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * 单个读取字符
     */
    @Test
    public void t2() {
        String filePath = "e:\\a.txt";
        //1.创建FileReader对象
        FileReader fileReader = null;
        int data = ' ';
        try {
            fileReader = new FileReader(filePath);
            //循环读取，使用read,单个字符读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
