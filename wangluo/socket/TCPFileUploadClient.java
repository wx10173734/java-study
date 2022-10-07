package wangluo.socket;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @title: TCPFileUploadClient
 * @Author luozouchen
 * @Date: 2022/10/7 13:59
 * @Version 1.0
 * 文件上传客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //客户端连接服务端 9999 得到socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket" + socket.getClass());

        //创建读取磁盘文件的输入流
        String filePath = "e:\\1.png";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));

        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //通过socket获取到输出流，将bytes数据发送给服务器
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytes);//将文件对应的字节数组的内容，写入到数据通道
        bufferedInputStream.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //接受从服务器端回复的消息
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String s = bufferedReader.readLine();
//        System.out.println(s);
        //使用StreamUtils 的方法，直接将inputStream 读取到的内容 转成字符串
        String s = StreamUtils.streamToString(socket.getInputStream());
        System.out.println(s);

        //关闭相关的流
        bufferedOutputStream.close();
        socket.close();


    }
}
