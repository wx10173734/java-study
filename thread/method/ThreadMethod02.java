package thread.method;

/**
 * @title: ThreadMethod02
 * @Author luozouchen
 * @Date: 2022/9/28 14:34
 * @Version 1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了" + i + "个包子");
            if (i==5){
                System.out.println("主线程让子线程 先吃");
                //join 线程插队，一定成功
//                t1.join();//相当于让t1线程先执行完毕
                t1.yield();//礼让，不一定成功
                System.out.println("子线程吃完了，主线程接着吃");
            }
        }

    }
}

class T1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);//休眠1秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程 吃了" + i + "个包子");
        }

    }
}

