package thread.threaduse;

/**
 * @title: Thread02
 * @Author luozouchen
 * @Date: 2022/9/27 16:35
 * @Version 1.0
 * 通过实现接口Runnable
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start() 这里不能调用start
        //创建了Thread对象，把dog对象(实现Runnable)，放入Thread,底层使用了设计模式（代理模式）
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable {

    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hi.." + (++count) + Thread.currentThread().getName());
            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }
    }
}
