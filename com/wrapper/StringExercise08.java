package com.wrapper;

/**
 * @author luozouchen
 * @date 2022/8/4
 * @apiNote
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        //1.先创建一个StringBulider sb = new StringBulider()
        //2.执行 sb.append("hello)
        //3.执行 sb.append("abc")
        //4.String s = sb.toString()
        //最后其实是c指向堆中的对象（String）value[]->池中"helloabc"
        String c = a+b;
    }
}
