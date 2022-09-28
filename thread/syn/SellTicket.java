package thread.syn;

/**
 * @title: SellTicket
 * @Author luozouchen
 * @Date: 2022/9/27 20:49
 * @Version 1.0
 * 使用多线程，模拟三个窗口同时售票
 */
public class SellTicket {
    public static void main(String[] args) {
        //测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        //这里会出现票数超卖
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
        System.out.println("使用实现接口的方式来售票");
//        SellTicket02 sellTicket02 = new SellTicket02();
//        new Thread(sellTicket02).start();//第1个线程-窗口
//        new Thread(sellTicket02).start();//第2个线程-窗口
//        new Thread(sellTicket02).start();//第3个线程-窗口
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();

    }
}

//使用synchronized实现线程同步
class SellTicket03 implements Runnable {

    private int ticketNum = 100;//让多个线程共享Num
    private boolean loop = true;//控制run方法变量
    Object object = new Object();

    //同步方法 （静态的）的锁为当前类本身
    //1.public synchronized static void m1(){} 锁是加在 SellTicket03.class
    //2.如果在静态方法中，实现一个同步代码块
    /*
     synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
     */
    public synchronized static void m1() {
    }

    public static void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }

    //说明
    //1.private synchronized void sell() 就是一个同步方法
    //2.这时锁在this 对象
    //3.也可以在代码块上写synchronized,同步代码块,互斥锁还是在this对象
    public /*synchronized*/ void sell() {//同步方法，在同一时刻只能有一个线程来执行run方法
        synchronized (/*this*/ object) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }
            //休眠50ms,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();//sell方式是一个同步方法
        }
    }
}


//new SellTicket01.start()
//new SellTicket01.start()
class SellTicket01 extends Thread {
    private static int ticketNum = 100;//让多个线程共享Num
//    public void m1(){
//        synchronized (this)
//        System.out.println("hello");
//    }

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            //休眠50ms,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));

        }
    }
}

class SellTicket02 implements Runnable {

    private int ticketNum = 100;//让多个线程共享Num

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }
            //休眠50ms,模拟
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));

        }
    }
}
