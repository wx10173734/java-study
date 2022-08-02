package com.innerclass;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类当作实参直接传递，简洁高效
        //f1(new IL() {
        //    @Override
        //    public void show() {
        //        System.out.println("这是一个名画。。。");
        //    }
        //});
        f1(new ILImpl());


    }
    //静态方法，形参是接口类型
    public static void  f1(IL il){
        il.show();
    }
}
interface IL{
    public void show();
}
class ILImpl implements IL{
    @Override
    public void show() {
        System.out.println("这是一副明华》。。");
    }
}

