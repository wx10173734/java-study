package com.fanxing;

/**
 * @title: Gemeric03
 * @Author luozouchen
 * @Date: 2022/9/24 13:43
 * @Version 1.0
 */
public class Gemeric03 {
    public static void main(String[] args) {
        //注意，特别强调： E 具体的数据类型在定义 Person 对象的时候指定,即在编译期间，就确定 E 是什么类型
        Person<String> person = new Person<String>("罗邹晨");
        person.t();
        /*
            上面的Person类
            class Person<String> {
            String s;//E表示s的数据类型，该数据类型是在定义Person对象的时候指定的，即在编译期间，就确定E是什么类型

            public Person(String s) {//E表示参数类型
                this.s = s;
            }

            public String f() {//E表示返回类型
                return s;
            }
        }
         */
        Person<Integer> integerPerson = new Person<>(100);
        integerPerson.t();
        /*
           Integer s;//E表示s的数据类型，该数据类型是在定义Person对象的时候指定的，即在编译期间，就确定E是什么类型

            public Person(Integer s) {//E表示参数类型
                this.s = s;
            }

            public Integer f() {//E表示返回类型
                return s;
            }
         */
    }
}

//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，
// 或者是某个方法的返回值的类型，或者是参数类型
class Person<E> {
    E s;//E表示s的数据类型，该数据类型是在定义Person对象的时候指定的，即在编译期间，就确定E是什么类型

    public Person(E s) {//E表示参数类型
        this.s = s;
    }

    public E f() {//E表示返回类型
        return s;
    }
    public void t(){
        System.out.println(s.getClass());//显示s的运行类型
    }
}