package wangluo.udp;

import java.io.IOException;
import java.net.*;

/**
 * @title: UDPSenderB
 * @Author luozouchen
 * @Date: 2022/10/7 21:24
 * @Version 1.0
 * <p>
 * UDP发送端 ====》也可以接受数据
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket 准备在9998端口接受数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据，封装到Datagrampacket 中
        byte[] data = "hello 明天吃火锅".getBytes();//InetAddress.getLocalhost
        //说明：封装的DatagramPacket对象 data 内容字节数组 ，data.length,主机（ip），端口
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.101.219.252"), 9999);

        socket.send(packet);//发送


        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        //3.调用接收方法,将通过网络传输的 DatagramPacket 对象 填充到 packet对象
        //提示:当有数据包发送到本机的9998端口时，就会接收到数据
        //如果没有数据包发送到本机的9998
        System.out.println("接口端A 等待接受数据..");
        socket.receive(packet);
        //4.可以把packet 进行拆包，取出数据，并显示
        int length = packet.getLength(); // 实际接收到的数据字节长度
        data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //关闭资源
        socket.close();
        System.out.println("b端退出");

    }
}
