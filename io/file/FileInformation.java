package io.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @title: FileInformation
 * @Author luozouchen
 * @Date: 2022/9/29 20:48
 * @Version 1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    //获取文件的信息
    @Test
    public void information() {
        //先创建文件对象
        File file = new File("e:\\news1.txt");
        //调用相应的方法，得到对应信息
        System.out.println("文件名===="+file.getName());
        ////getName、getAbsolutePath、getParent、length、exists、isFile、isDirectory
        System.out.println("文件的绝对路径="+file.getAbsolutePath());
        System.out.println("文件的父目录="+file.getParent());
        System.out.println("文件的大小(字节)"+file.length());
        System.out.println("文件是否存在="+file.exists());
        System.out.println("是不是一个文件"+file.isFile());
        System.out.println("是不是一个目录"+file.isDirectory());
    }
}
