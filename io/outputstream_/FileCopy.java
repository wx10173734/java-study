package io.outputstream_;

import java.io.*;

/**
 * @title: FileCopy
 * @Author luozouchen
 * @Date: 2022/10/2 15:42
 * @Version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝 将e:\\1.png 拷贝到d:\\
        //思路分析
        //1.创建文件输入流，将文件读入到程序
        //2.创建文件输出流，将读取到的文件数据写入到指定的位置。  读取部分数据，就写入到指定文件，这里使用循环

        String srcFilePath = "e:\\1.png";
        String destFilePath = "d:\\2.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);//输入流
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组，提交读取效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //读取到后就写入到文件,通过fileOutputStream
                //即，是一边读一边写
                fileOutputStream.write(buf, 0, readLen);//一定要使用这个方法
            }
            System.out.println("拷贝Ok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
