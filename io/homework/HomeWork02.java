package io.homework;

import java.io.*;

/**
 * @title: HomeWork01
 * @Author luozouchen
 * @Date: 2022/10/3 21:38
 * @Version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\a.txt";
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        String line = "";
        int lineNum = 0;
        while ((line = br.readLine()) != null) {
            System.out.println(++lineNum + line);
        }
        br.close();
    }
}
