package thread.exit_;

/**
 * @title: ThreadExit_
 * @Author luozouchen
 * @Date: 2022/9/27 22:34
 * @Version 1.0
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();
        //如果希望main线程去控制t1线程的终止，必须可以修改loop
        //让t1退出run方法，从而终止t1线程-》通知方式

        //让主线程休眠10秒，在通知t1线程退出
        System.out.println("main线程休眠10s");
        Thread.sleep(10 * 1000);
        t1.setLoop(false);
    }
}

class T extends Thread {
    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);//让当前程序休眠50ms
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A Thread 运行中..." + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

}
