package com.wrapper.sringbuffer;



/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String - StringBuffer
        String str = "hello tom";
        //对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer1 = new StringBuffer();
        //方式2
        stringBuffer1 = stringBuffer1.append(str);

        //StringBuffer -》String
        StringBuffer stringBuffer3 = new StringBuffer("lzc");
        //1.
        String s = stringBuffer3.toString();
        //2.使用构造器来搞定
        String string = new String(stringBuffer3);
    }
}
