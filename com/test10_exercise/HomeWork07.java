package com.test10_exercise;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class HomeWork07 {
    public static void main(String[] args) {
        new Car_(20).getAir().flow();
        new Car_(-1).new Air().flow();

    }
}
class Car_{
    private double temperature;

    public Car_(double temperature) {
        this.temperature = temperature;
    }

    public class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("吹冷气");
            }else if (temperature <0){
                System.out.println("吹暖气");
            }else {
                System.out.println("温度正常，关闭空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

}
