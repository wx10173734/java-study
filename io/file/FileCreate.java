package io.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @title: FileCreate
 * @Author luozouchen
 * @Date: 2022/9/29 19:51
 * @Version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1 new File(String pathname)
    @Test
    public void create01() {
        String filepath = "e:\\news1.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    //e:\\news2.txt
    @Test
    public void create02() {
        File parentFile = new File("e:\\");
        String fileName = "news2.txt";
        //这里的file对象，在java程序中，只是一个对象
        File file = new File(parentFile, fileName);
        try {
            //只有执行了createNewFile 才会真正的在磁盘创建文件
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //方式3  new File(String parent,String child) //根据父目录+子路径构建
    @Test
    public void create03() {
        String parentPath = "e:\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //下面四个都是抽象类

    //InputStream
    //OutputStream
    //Reader //字符输入流
    //Writer //字符输出流
}

