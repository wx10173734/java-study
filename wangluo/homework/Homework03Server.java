package wangluo.homework;

import wangluo.socket.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @title: Homework03Server
 * @Author luozouchen
 * @Date: 2022/10/8 19:49
 * @Version 1.0
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {
//        String s = "4544444s.mp4";
//        String substring = s.substring(0,s.lastIndexOf("."));
//        System.out.println(substring);
        //1.监听9999端口，并读取发送下载文件的名字
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端socket 9999端口等待监听");
        //等待客户端连接
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket" + socket.getClass());

        //2.读取客户端发送的要下载的文件名
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String s = bufferedReader.readLine();
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileName = "";
        while ((len = inputStream.read(b)) != -1) {
            downLoadFileName += new String(b, 0, len);
        }
        System.out.println("客户端希望下载文件名=" + downLoadFileName);
        //在服务器上有两个文件
        //如果下载的是 1.png 返回该文件，否则一律返回2.png
//        String filePath = "e:\\hm";
//        String fileName = s + ".png";
//        String mofileName = "2.png";
//        File file = new File(filePath, fileName);
        String resFileName = "";
        if ("1".equals(downLoadFileName)) {
            resFileName = "e:\\hm\\1.png";
        } else {
            resFileName = "e:\\hm\\2.png";
        }


//        BufferedInputStream bufferedInputStream = null;
//        BufferedOutputStream bufferedOutputStream = null;
//        if (!file.exists()) {
//            bufferedInputStream = new BufferedInputStream(new FileInputStream(resFileName));
//        } else {
//            bufferedInputStream = new BufferedInputStream(new FileInputStream(resFileName));
//        }
        //4.创建一个输入流，读取文件
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resFileName));
        //5.使用工具类，读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //6.得到socket关联的输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        //7.写入到数据通道，返回给客户端
        bufferedOutputStream.write(bytes);
        socket.shutdownOutput();//很关键

        //8.关闭资源
        bufferedInputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");


    }
}
