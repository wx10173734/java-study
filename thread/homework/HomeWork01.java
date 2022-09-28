package thread.homework;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @title: HomeWork01
 * @Author luozouchen
 * @Date: 2022/9/28 20:57
 * @Version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);//一定要注意
        a.start();
        b.start();

    }
}

class A extends Thread {
    boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            int num = (int) (Math.random() * 100 + 1);
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("A线程退出");
    }
}

class B extends Thread {
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            //接收到用户的输入
            System.out.println("请输入你的指令(Q)表示退出:");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //以通知的方式结束a线程
                a.setLoop(false);
                System.out.println("B线程退出");
                break;
            }
        }

    }
}
