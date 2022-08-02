package com.test10_exercise;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Person person = new Person("lzc", new Horse());
        person.common();
        person.passRiver();
        person.common();
        person.passRiver();
        person.passRiver();
        person.passRiver();
    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般使用马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过水使用船");
    }
}

//这里将方法做成static比较方便
class Factory {
    //马儿始终是同一批
    private static Horse horse = new Horse();//单例模式  饿汉式

    private Factory() {
    }



    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
    }

    public void passRiver() {
        //如何防止始终使用的是传入的马对象
        //if (vehicles == null) {
        // !(vehicles instanceof Boat)判断当前的vehicles是不是boat
        //1.vehicles 为null ： vehicles instanceof Boat=》false
        //2.vehicles = 马对象， vehicles instanceof Boat=》false
        //3.vehicles = 船 vehicles instanceof Boat=》true
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        //先得到船
        vehicles.work();
    }

    public void common() {
        //先得到船
        //判断当前的 vehicles属性 是否已经存在了
        //if (vehicles == null) {
        if (!(vehicles instanceof Horse)) {
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
}
