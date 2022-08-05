package com.wrapper.stringbuild;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        //1. StringBuffer的直接父类 是 AbstractStringBuilder
        //2. StringBuffer现了   Serializable,StringBuffer 的对象可以串行化
        //3.   在父类中AbstractStringBuilder有属性char[] value,不是 final
        // 该 value数组存放 字符串内容，引出存放在堆中的
        //4. StringBuffer 是一个final类,不能被继承
        //5. 因为 StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)
        // 不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String
        //没有做互斥的处理 即没有synchronized关键字，因为在单线程的情况下使用StringBuilder
    }
}
