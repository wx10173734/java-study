package java8.lzc.java1.Lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @title: LambdaTest1
 * @Author luozouchen
 * @Date: 2022/10/17 11:20
 * @Version 1.0
 * Lambda表达式的使用
 */
public class LambdaTest1 {
    /**
     * 1。举例 (o1,o2) -> Integer.compare(o1,o2)
     * 2.格式:
     * -> Lambda操作符 或箭头操作符
     * ->左边，Lambda 形参列表 其实接口中的抽象方法的形参列表
     * -> 右边，Lambda体  (其实就是重写的抽象方法的方法体)
     * 3. Lambda表达式的使用: 分为6中情况介绍
     * 4.Lambda 表达式的本质： 作为函数式接口的实例
     * 5.如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口
     *
     *  总结:
     *  ->左边 Lambda 形参列表的参数类型可以省略（类型推断） ，如果 Lambda 形参列表 只有一个参数，其一对()也可以省略
     *  ->右边 Lambda 应该使用一对{} 包裹，如果 lambda只有一条执行语句 （可能是return语句） 省略这一对{} 和 return
     *  所有以前匿名实现类表示的现在都可以用lambda表达式来写
     */

    @Test
    public void test1() {
        //语法格式1：无参，无返回值
        Runnable r1 = () -> {
            System.out.println("我爱罗邹晨");
        };
        r1.run();


    }

    @Test
    public void test2() {
        //语法格式二： Lambda需要一个参数，但是没有返回值
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么");

        System.out.println("****************");
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("你好，我是罗祖陈");
    }

    @Test
    public void test3() {
        //语法格式3 数据类型可以省略，因为可有编译器推断得出，称为类型判断
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("你好，我是罗祖陈");
        System.out.println("***************");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("jajaj");
    }

    @Test
    public void test4() {
        ArrayList<String> arrayList = new ArrayList<>();//类型推断
        int[] arr = {1, 2, 3};//类型推断
    }

    @Test
    public void test5() {
        //语法格式4：lambda 若只需要一个参数时，参数的小括号可以省略
        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("jajaj");
    }

    @Test
    public void test6() {
        //语法格式5：lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("***********");
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(21, 12));

    }

    @Test
    public void test7(){
        //语法格式6：lambda体 只有一条语句时，return 与大括号若有，都可以省略
        Comparator<Integer> com1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println(com1.compare(21, 12));

        System.out.println("*************");
        Comparator<Integer> com2 = (o1, o2) ->  o1.compareTo(o2);
        System.out.println(com2.compare(12, 21));
    }

    @Test
    public void test8(){
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("jajaj");

        System.out.println("*********");

        Consumer<String> con2 = (s) -> System.out.println(s);

        con2.accept("sdasdasdas");

    }


}
