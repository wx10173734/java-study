package io.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @title: Directory_
 * @Author luozouchen
 * @Date: 2022/9/29 20:55
 * @Version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    //1.判断d:\\news1.txt 是否存在，如果存在就删除
    @Test
    public void m1() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        boolean exists = file.exists();
        if (exists) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }
    }

    //判断 D:\\demo02是否存在，存在就删除，否则提示不存在
    //这里需要知道 在java编程中，目录也被当作文件
    @Test
    public void m2() {
        String filePath = "e:\\demo02";
        File file = new File(filePath);
        boolean exists = file.exists();
        if (exists) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("目录不存在");
        }
    }

    //判断 d:\\demo\\a\\b\\c 是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void m3() {
        String filePath = "e:\\demo\\a\\b\\c";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("目录已经存在");
        } else {
            if (file.mkdirs()) {//创建一级目录使用mkdir(),创建多级目录使用mkdirs()
                System.out.println("目录创建成功");
            } else {
                System.out.println("创建失败");
            }
        }
    }
}
