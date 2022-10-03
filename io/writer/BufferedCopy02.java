package io.writer;

import java.io.*;

/**
 * @title: BufferedCopy02
 * @Author luozouchen
 * @Date: 2022/10/3 14:42
 * @Version 1.0
 * 演示使用BufferedInputStream和BufferedOutputStream使用
 * 使用这个，可以完成二进制文件拷贝
 * 字节流可以操作i二进制文件，可以操作文本文件
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
//        String srcFilePath = "e:\\1.png";
//        String descFilePath = "d:\\2.png";
        String srcFilePath = "e:\\a.txt";
        String descFilePath = "d:\\b.txt";
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(descFilePath));
            //循环读取文件，并写入到destFilePath
            byte[] buf = new byte[1024];
            int readlen = 0;
            //当返回-1，表示读取完毕
            while ((readlen = bufferedInputStream.read(buf)) != -1) {
                bufferedOutputStream.write(buf, 0, readlen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("拷贝成功");
        //关闭流 , 关闭外层的处理流即可，底层会去关闭节点流
        try {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
