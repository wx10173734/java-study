package fanshe.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @title: HomeWork01
 * @Author luozouchen
 * @Date: 2022/10/15 22:36
 * @Version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws Exception {
//        Class<?> testCls = Class.forName("fanshe.reflection.homework.PrivateTest");
//        Object o = testCls.newInstance();
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTest = privateTestClass.newInstance();
        //得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);//爆破
        name.set(privateTest, "罗邹晨");

        Method getName = privateTestClass.getMethod("getName");
        System.out.println(getName.invoke(privateTest));
    }
}

class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}
