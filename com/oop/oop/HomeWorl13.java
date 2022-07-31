package com.oop.oop;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class HomeWorl13 {
    public static void main(String[] args) {
        Circle c = new Circle();
        new PassObject().printAreas(c,5);
    }
}
class Circle{
    double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI*this.radius*radius;
    }

}
class PassObject{
    public void printAreas(Circle c,int times){
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println(c.findArea());
        }
    }
}
