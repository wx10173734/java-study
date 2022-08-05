package com.wrapper.sringbuffer;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello,张三丰赵敏100true10.5");
        //删除11-14的字符,不包含14 [11,14)
        //s.delete(11,14);
        //System.out.println(s);

        //改 不包含11

        //s.replace(9,11,"周芷若");
        //System.out.println(s);

        //插入 在索引的为9的位置插入，原来为9的自动后移
        s.insert(9,"赵敏");
        System.out.println(s);
    }
}
