package thread.method;

/**
 * @title: ThreadMethod01
 * @Author luozouchen
 * @Date: 2022/9/27 23:22
 * @Version 1.0
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("lzc");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();


        //主线程打印5个hi 然后我就中断 子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        System.out.println(t.getName()+"线程的优先级="+t.getPriority());//1
        t.interrupt();//当执行到这里时，就会中断 t线程的休眠

    }
}

class T extends Thread {//自定义线程类

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                //Thread.currentThread().getName() 获取当前线程的名称
                System.out.println(Thread.currentThread().getName() + "   吃包子~~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当该线程执行到一个interrupt方法时，就会catch一个异常，可以加入自己的业务代码
                //InterruptedException 是捕获到一个中断异常
                System.out.println(Thread.currentThread().getName() + "被 interrupt了");
            }
        }
    }
}
