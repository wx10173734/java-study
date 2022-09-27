package thread.threaduse;

/**
 * @title: ProxyThread
 * @Author luozouchen
 * @Date: 2022/9/27 16:44
 * @Version 1.0
 */
public class ProxyThread {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();//实现了runnable接口
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();

    }
}

class Animal {

}

class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫...");
    }
}

//线程代理类，模拟了一个极简的thread
class ThreadProxy implements Runnable {//可以把Proxy类 当作Thread
    private Runnable target = null;//属性，类型是 Runnable

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定(运行类型Tiger)
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//真正实现多线程的方法
    }

    public void start0() {
        run();
    }
}