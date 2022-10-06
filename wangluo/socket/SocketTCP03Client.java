package wangluo.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


/**
 * @title: SocketTCP03Client
 * @Author luozouchen
 * @Date: 2022/10/6 14:34
 * @Version 1.0
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket" + socket.getClass());

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server 字符流");
        bufferedWriter.newLine();//插一个换行符，表示写入的内容结束，注意，要求对方使用readLine()方式来读！！！！！
        bufferedWriter.flush();// 如果使用的字符流，需要手动刷新，否则数据不会写入数据通道

        // 获取和 socket 关联的输入流. 读取数据(字符)，并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = bufferedReader.readLine();
        System.out.println(line);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
