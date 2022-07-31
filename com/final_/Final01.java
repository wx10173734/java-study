package com.final_;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class Final01 {
    public static void main(String[] args) {

    }
}
//如果我们要求A类不能被其他类继承
//可以使用final修饰 a类
class A{

}
class B extends A{

}
class C{
    //如果要求hi方法不能被子类重写 但可以继承
    //可以使用final修饰hi 方法
    public void hi(){

    }
}
class D extends C{
    @Override
    public void hi() {
        System.out.println("重写了c类的hi方法");
    }
}
class E{
    public double TAX_RATE = 0.08;
}
