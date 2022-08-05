package com.wrapper.sringbuffer;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //直接父类是AbstractStringBuilder
        //实现了serializable 即对对象可以串行化
        //在父类中 AbstractStringBuilder 有属性char[] value不是final
        //该value数组存放字符串内容，
        //StringBuffer是一个final类，不能被继承
        //因为他是存放在 char[]value中，所有在变化 不用每次都更换地址即创建新对象效率高于String

        //他会创建一个大小为16的 char[]勇于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //2.通过构造器指定char【】大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3.通过给一个String 创建 StringBuffer 大小是str.length +16
        StringBuffer hello = new StringBuffer("hello");
    }
}
