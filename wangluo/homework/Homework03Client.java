package wangluo.homework;

import wangluo.socket.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @title: Homework03Client
 * @Author luozouchen
 * @Date: 2022/10/8 19:49
 * @Version 1.0
 */
public class Homework03Client {
    public static void main(String[] args) throws Exception {
        //1.客户端连接服务器，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket" + socket.getClass());

        //2.接受用户输入 指定下载文件名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名");
        String downloadFileName = sc.next();

        //3.获取和socket关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //设置写入结束的标志
        socket.shutdownOutput();
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bufferedWriter.write(next);
//        bufferedWriter.newLine();
//        bufferedWriter.flush();

        //4.读取服务端返回的文件（字节数据）
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //5.得到输出流 准备将bytes写入到磁盘文件
        //比如下载的是 1.png 下载的就是png
        //下载的是dsioaudiosaj 下载的是 2.png
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("e:\\"+downloadFileName+".png"));
        bufferedOutputStream.write(bytes);

        bufferedOutputStream.close();
        bufferedInputStream.close();
        sc.close();
        socket.close();
        System.out.println("客户端下载完毕，正确退出");
    }
}
