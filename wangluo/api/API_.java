package wangluo.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @title: API_
 * @Author luozouchen
 * @Date: 2022/10/6 10:25
 * @Version 1.0
 * 演示InetAddress类的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAdress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //2.根据指定主机名获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("lzc");
        System.out.println(host1);

        //3.根据域名返回一个InetAddress对象 比如www.casual-s.toop
        InetAddress host2 = InetAddress.getByName("www.casual-s.top");
        System.out.println(host2);

        //4.通过InetAdrress对象，获取对应的地址
        String hostAddress = host2.getHostAddress();// ip 地址
        System.out.println("host2对应的ip地址"+hostAddress);

        //5.通过InetAdrress对象 获取对应的主机名/或者域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名="+hostName);

    }
}
