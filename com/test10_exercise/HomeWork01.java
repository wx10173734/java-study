package com.test10_exercise;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(100);
        System.out.println(car);
        System.out.println(car1);
    }
}
class Car{
    double price = 10;
    static String color = "white";
    public String toString(){
        return price +"\t"+color;
    }
    public Car(){
        this.price = 9;
        this.color="red";
    }
    public Car(double price){
        this.price = price;
    }
}
