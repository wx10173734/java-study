package thread.method;

/**
 * @title: ThreadMethodExercise
 * @Author luozouchen
 * @Date: 2022/9/28 15:20
 * @Version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        Thread thread = new Thread(t2);
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            if (i == 5) {
                thread.start();//启动子线程
                thread.join();//立即将子线程插入到main,让子线程先执行
                System.out.println("子线程结束");
            }
            Thread.sleep(1000);


        }
        System.out.println("主线程结束");
    }
}

class T2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello" + i);
        }
    }
}
