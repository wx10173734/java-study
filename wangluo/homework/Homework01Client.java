package wangluo.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @title: Homework01Client
 * @Author luozouchen
 * @Date: 2022/10/7 22:41
 * @Version 1.0
 */
public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket" + socket.getClass());

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //从键盘读取用户的问题
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String next = scanner.next();

        bufferedWriter.write(next);
        bufferedWriter.newLine();
        bufferedWriter.flush();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);




        bufferedReader.close();
        bufferedWriter.close();
        socket.close();


    }
}
