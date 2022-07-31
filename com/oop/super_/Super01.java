package com.oop.super_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Super01 {
    public static void main(String[] args) {

    }
}

class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public A(){

    }
    public A(String name){}
    public A(String name,int age){}

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }
}
class B extends A{
    //访问父类的属性，但不能访问父类private属性
    public void hi(){
        System.out.println(super.n1+" "+super.n2+" "+super.n3);
    }
    //访问父类的方法，但不能访问父类private方法
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }
    public B(){
        //super();
        //super("jack",10);
        //super("jack");
    }
}
