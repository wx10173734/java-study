package com.wrapper;

/**
 * @author luozouchen
 * @date 2022/8/4
 * @apiNote
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类（Integet->String）
        Integer i = 100;//自动装箱
        //方式1
        String str = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String->包装类(Integer)
        String str4 = "12345";
        int i1 = Integer.parseInt(str4);//自动装箱
        Integer integer = new Integer(str4);
    }
}
