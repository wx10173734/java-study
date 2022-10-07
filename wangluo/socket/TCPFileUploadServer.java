package wangluo.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @title: TCPFileUploadServer
 * @Author luozouchen
 * @Date: 2022/10/7 13:58
 * @Version 1.0
 * 文件上传服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //1.服务端在本机监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.等待连接
        System.out.println("服务端，在 9999 端口监听，等待连接..");
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket" + socket.getClass());

        //3.读取客户端发送的数据
        //通过socket得到输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //将得到的bytes数组，写入到指定的路径，就得到一个文件了
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("wangluo\\2.png"));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();

        //向客户端回复 “收到图片”
        //通过socket获取到输出流(字符流)
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();//把内容刷新到数据通道
        socket.shutdownOutput();//设置写入结束标记

        //关闭其他资源
        bufferedWriter.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();


    }
}
