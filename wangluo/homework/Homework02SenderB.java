package wangluo.homework;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @title: Homework02SenderB
 * @Author luozouchen
 * @Date: 2022/10/8 19:30
 * @Version 1.0
 */
public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8889);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String next = sc.next();
        byte[] data = next.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.101.219.252"), 8888);
        socket.send(packet);

        //接受A端消息
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        int length = packet.getLength();
        byte[] data1 = packet.getData();
        String s = new String(data1, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("发送端B退出");


    }
}
