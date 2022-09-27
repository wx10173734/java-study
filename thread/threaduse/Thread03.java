package thread.threaduse;

/**
 * @title: Thread03
 * @Author luozouchen
 * @Date: 2022/9/27 19:32
 * @Version 1.0
 */
public class Thread03 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        T4 t4 = new T4();
        Thread thread1 = new Thread(t3);
        Thread thread2 = new Thread(t4);
        thread1.start();//启动第一个线程
        thread2.start();//启动第二个线程
        System.out.println("main线程继续");
    }
}

class T3 implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("hello,world" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                break;
            }
        }
    }
}
class T4 implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("hi" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 5) {
                break;
            }
        }
    }
}
