package com.list_;

/**
 * @author luozouchen
 * @date 2022/8/10
 * @apiNote
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hei = new Node("hei");
        //连接三个节点，形成双向链表
        //jack->tom->hei
        jack.next = tom;
        tom.next = hei;
        //hsp->tom->jack
        hei.pre = tom;
        tom.pre = jack;
        Node first = jack;//让firt引用指向jack，就是双向链表的头结点
        Node last = hei;//last引用指向hei,双向链表的尾结点
        //演示从头到尾进行遍历
        while (true) {
            if (first == null) {
                break;
            }
            //输入first信息
            System.out.println(first);
            first = first.next;
        }
        //演示从未到头的遍历
        while (true) {
            if (last == null) {
                break;
            }
            //输入last信息
            System.out.println(last);
            last = last.pre;
        }
        //演示链表添加数据，多么方便
        //要求是tom-----hei之间插入一个对象smith

        //1.创建一个Node节点 ，name就是smith
        Node smith = new Node("smith");
        smith.next = hei;
        smith.pre = tom;
        tom.next = smith;
        hei.pre = smith;
        first = jack;
        //让first再次指向jack
        System.out.println("----");
        while (true) {
            if (first == null) {
                break;
            }
            //输入first信息
            System.out.println(first);
            first = first.next;
        }
    }
}

//定义一个  Node    类，Node    对象    表示双向链表的一个结点
class Node {
    public Object item; //真正存放数据
    public Node next; //指向后一个结点
    public Node pre;  //指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node  name=" + item;
    }
}
