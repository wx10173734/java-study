package com.wrapper;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringUML_ {
    public static void main(String[] args) {
       String str1 = "hello";
       String str2 = "Hello";
        System.out.println(str1.equals(str2));//比较内容是否相同区分大小写
        String username = "johN";//不区分大小写
        if ("john".equalsIgnoreCase(username)){
            System.out.println("success");
        }else {
            System.out.println("failure");
        }
        System.out.println(str1.length());
        String s1 = "wer@terwe@g@";
        int i = s1.indexOf('b');
        System.out.println(i);
        int we = s1.indexOf("we");
        int i1 = s1.lastIndexOf('@');
        System.out.println(i1);
        int ter = s1.lastIndexOf("ter");
        System.out.println("ter"+ter);
        String name = "hello,张三";
        //从索引6开始截取，后面所有的内容
        System.out.println(name.substring(2));//截取后面的字符
        //从索引0开始截取，截取到索引5-1位置
        System.out.println(name.substring(2,5));
    }
}
