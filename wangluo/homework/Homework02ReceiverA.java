package wangluo.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @title: Homework02ReceiverA
 * @Author luozouchen
 * @Date: 2022/10/8 19:30
 * @Version 1.0
 */
public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端在8888端口等待数据");
        socket.receive(packet);

        //拆包
        String answer = "";
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        if ("四大名著是哪些".equals(s)) {
            answer = "四大名著是<红楼梦>";
        } else {
            answer = "what?";
        }

        //回复信息给B端
        data = answer.getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.101.219.252"), 8889);
        socket.send(packet);

        socket.close();
        System.out.println("A端退出");

    }
}
