package wangluo.socket;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @title: SocketTCP01Server
 * @Author luozouchen
 * @Date: 2022/10/6 10:50
 * @Version 1.0
 * 服务端
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        //思路：完成会送消息的绿色线
        //1.socket.getOutputStream
        //2.写入数据到数据通道
        //3.关闭socket和io
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在 9999 端口监听，等待连接..");
        Socket socket = serverSocket.accept();
        System.out.println("客户端socket" + socket.getClass());

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }

        //获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        //设置一个结束标记
        socket.shutdownOutput();

        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
