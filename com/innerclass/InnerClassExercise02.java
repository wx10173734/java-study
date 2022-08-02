package com.innerclass;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        /*
        1.传递的是一个实现了bell接口的匿名内部类
        2.重写了ring
        3.Bell bell = new Bell(){
        @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        }

         */
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();//动态绑定
    }
}
