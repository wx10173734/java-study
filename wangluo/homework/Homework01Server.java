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
        String answer = "";
        if ("name".equals(s)) {
            answer = "我是lzc";
        } else if ("hobby".equals(s)) {
            answer = "编写java程序";
        } else {
            answer = "你说啥";
        }


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();


    }
}
