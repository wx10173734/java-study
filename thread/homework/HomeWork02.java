package thread.homework;

/**
 * @title: HomeWork02
 * @Author luozouchen
 * @Date: 2022/9/28 22:21
 * @Version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Money money1 = new Money();
        Thread thread1 = new Thread(money1);
        thread1.setName("t1");
        Thread thread2 = new Thread(money1);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}

class Money implements Runnable {
    static int total = 10000;
    private boolean loop = true;

//    public synchronized void qu() {
//        if (total < 1000) {
//            System.out.println("余额不足");
//            loop = false;
//            return;
//        }
//        total -= 1000;
//        System.out.println("取出1000块" + "余额为" + (total));
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public void run() {
        while (loop) {
//            qu();
            //1.这里使用 synchronized 实现了线程同步
            //2.当多个线程执行到这里时，就会去争夺this对象锁
            //3.哪个线程争夺到（获取）this对象锁，就执行synchronized代码快，执行完后，会释放this对象锁
            //4.争夺不到this对象锁的 就blocked ,准备继续争夺
            synchronized (this) {//非公平锁
                if (total < 1000) {
                    System.out.println("余额不足");
                    loop = false;
                    return;
                }
                total -= 1000;
                System.out.println(Thread.currentThread().getName()+"取出1000块" + "余额为" + (total));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
