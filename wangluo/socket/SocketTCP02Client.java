package wangluo.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @title: SocketTCP01Client
 * @Author luozouchen
 * @Date: 2022/10/6 10:55
 * @Version 1.0
 * 客户端 发送 "hello.server"给服务端
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //思路:
        //1.socket.getInputStream
        //2.读取数据通道的数据
        //3.显示
        //4.关闭socket 和 io
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        //设置一个写入结束标记
        socket.shutdownOutput();
        //获取和socket关联的输入流，读取数据(字节)，并显示
        InputStream inputStream = socket.getInputStream();
        byte buf[] = new byte[1024];
        int readLine = 0;
        while ((readLine = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLine));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
