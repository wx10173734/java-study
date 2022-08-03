package com.exception_;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class ThrowsDetail {
    public static void main(String[] args) throws ArithmeticException {
        f2();
    }

    public static void f2() throws ArithmeticException {
        //对于编译异常，程序必须处理
        //2.对于运行异常，程序如果没有处理，默认throws
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }
}

class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {
    //3.子类重写父类的方式，对异常抛出规定。子类重写的方法所抛出的异常类型要么和父类一致，哟啊么为父类抛出异常类型的子类型
    @Override
    public void method() throws NullPointerException {
    }
}
