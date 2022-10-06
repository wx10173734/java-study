package wangluo.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @title: SocketTCP03Server
 * @Author luozouchen
 * @Date: 2022/10/6 14:34
 * @Version 1.0
 */
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在 9999 端口监听，等待连接..");
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket" + socket.getClass());

        InputStream inputStream = socket.getInputStream();
        //4. IO 读取, 使用字符流, 老师使用 InputStreamReader 将 inputStream 转成字符
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line = bufferedReader.readLine();
        System.out.println(line);


        OutputStream outputStream = socket.getOutputStream();
        // 使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client 字符流");
        bufferedWriter.newLine();//插入一个换行符，表示回复内容的结束
        bufferedWriter.flush();//注意需要手动刷新的flush


        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();


    }
}
