package thread.method;

/**
 * @title: ThreadMethod03
 * @Author luozouchen
 * @Date: 2022/9/28 15:49
 * @Version 1.0
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //只需将子线程设置为守护线程即可
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        //如果我们希望当main线程结束后，子线程自动结束
        for (int i = 1; i <=10; i++) {//main线程
            System.out.println("宝强在辛苦工作...");
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (; ;){//无限循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("马蓉和宋哲快乐聊天，哈哈哈~~~");
        }
    }
}
