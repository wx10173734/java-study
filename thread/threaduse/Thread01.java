package thread.threaduse;

/**
 * @title: Thread01
 * @Author luozouchen
 * @Date: 2022/9/27 15:19
 * @Version 1.0
 * 演示通过继承thread 类创建线程
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //创建一个Cat对象，可以当作线程使用】
        Cat cat = new Cat();
        /*
        (1)
            public synchronized void start() {
            start0();
            }
            (2)
            //start0() 是本地方法，是 JVM 调用, 底层是 c/c++实现
            //真正实现多线程的效果， 是 start0(), 而不是 run
            private native void start0
         */


        cat.start();//启动线程,最终会执行cat的run方法
        // cat.run();//run方法是一个普通的方法，没有真正的启动线程，就会把run方法执行完毕，才向下执行
        //说明:当main线程启动一个子线程 Thread-0, 主线程不会阻塞，会继续执行
        //这时 主线程和子线程交替执行...
        System.out.println("主线程继续执行，不会阻塞" + Thread.currentThread().getName());//名字 main
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i=" + i);
            //让主线程休眠
            Thread.sleep(1000);
        }

    }
}

//1.当一个类继承了Thread类，该类就可以当作线程使用
//2.我们会重写run方法，写上自己的业务代码
//3.run Thread类实现了 Runnable 接口的run方法
/*
 @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread {
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑

        int times = 0;
        while (true) {
            //该线程每隔 1 秒。在控制台输出 “喵喵, 我是小猫咪
            System.out.println("喵喵, 我是小猫咪" + (++times) + "线程名" + Thread.currentThread().getName());
            //让该线程休眠一秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break;//当times 到80 退出while循环，这时线程也就退出
            }
        }
    }
}
