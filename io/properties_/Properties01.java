package io.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @title: Properties01
 * @Author luozouchen
 * @Date: 2022/10/3 21:07
 * @Version 1.0
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties 文件，并得到ip,user,pwd
        BufferedReader bufferedReader = new BufferedReader(new FileReader("io\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {//循环读取
            String[] split = line.split("=");
            //如果要求指定的ip值
            if("ip".equals(split[0])){
                System.out.println(split[0]+split[1]);

            }


        }
    }
}
