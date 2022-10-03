package io.homework;

import java.io.*;

/**
 * @title: HomeWork01
 * @Author luozouchen
 * @Date: 2022/10/3 21:38
 * @Version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "e:\\mytemp";
//        String fileName = "hello.txt";
        File file = new File(directoryPath);
        if (file.exists()) {
            boolean newFile = file.createNewFile();
            if (!newFile) {
                System.out.println("目录已经存在");
            }
        } else {
            if (file.mkdir()) {
                System.out.println("创建" + directoryPath + "成功");
            } else {
                System.out.println("目录创建失败");

            }
        }
        String filePath = directoryPath + "\\hello.txt";
        file = new File(filePath);
        if (!file.exists()){
            //创建文件
            if (file.createNewFile()) {
                System.out.println(filePath+"创建成功~");
                //如果文件存在，使用BufferedWriter
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
                bufferedWriter.write("罗邹晨你好");
                bufferedWriter.close();
                System.out.println("写入成功");
            }else {
                System.out.println("创建失败");
            }
        }else {
            //如果文件已经存在，提示信息
            System.out.println(filePath+"已经存在,不在重复创建");
        }
    }
}
