package com.wrapper.sringbuffer;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(str);//null对象
        System.out.println(sb1);
    }
}
