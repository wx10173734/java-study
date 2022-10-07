package wangluo.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

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
        bufferedWriter.write("name");
        bufferedWriter.newLine();
        bufferedWriter.flush();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hobby");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s1 = bufferedReader.readLine();
        System.out.println(s1);


        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
