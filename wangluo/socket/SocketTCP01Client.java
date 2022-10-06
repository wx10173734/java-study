package wangluo.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @title: SocketTCP01Client
 * @Author luozouchen
 * @Date: 2022/10/6 10:55
 * @Version 1.0
 * 客户端 发送 "hello.server"给服务端
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //思路:
        //1.链接服务器端(ip,端口)
        //解读：链接本机的9999端口，如果链接成功，返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());
        //2.连接上后，生成socket，通过socket.getOutputStream()
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());
        //4.关闭流对象和socket,必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出。。。");
    }
}
