package wangluo.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @title: Homework01Server
 * @Author luozouchen
 * @Date: 2022/10/7 22:41
 * @Version 1.0
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("9999端口等待连接");
        Socket socket = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("我是lzc");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s1 = bufferedReader.readLine();
        System.out.println(s1);

        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("编写java程序");
        bufferedWriter.newLine();
        bufferedWriter.flush();



        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();


    }
}
