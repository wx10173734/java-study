package com.wrapper;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class StringUML_2 {
    public static void main(String[] args) {
        String s1 ="lzc";
        s1 = s1.concat("hello").concat("cc").concat("zc");
        System.out.println(s1);
        String s2 = "lzc and lzc and clz and pc";
        s2 = s2.replace("lzc","pp");
        //注意 s2.replace执行后返回的结果才是替换过的
        //注意本身对 s1没有任何影响
        System.out.println(s2);

        //split分割字符串，对于某些分割字符，需要转义比如 | \\等
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        //以 , 为标准对poem进行分割 ，返回一个数组
        String split[] = poem.split(",");
        poem="E:\\aaa\\bbb";
        //在对字符串进行分割时，如果有特殊字符，需要加转义符 \
        split = poem.split("\\\\");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        
        
        //toCharArray 转换成字符数组
        String s = "happy";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //compareto 比较两个字符串的大小，如果前者大，返回整数，后者大，返回复数，如果相等，
        //如果长度相同，并且每个字符串都相同 就返回0
        //如果长度相同，或者不相同但是在进行比较时可以区分大小 就返回 不同字符的差值
        //如果长度不同，如果前面的部分都相同，就返回两个字符串的长度相减
        String aa = "jackabc";
        String bb = "jack";
        System.out.println(aa.compareTo(bb));//返回值 'c' -'a' =2的值

        //format
        String name = "john";
        int age = 10;
        double score = 98.3/3;
        char gender = '男';
        //String info="name"+name+"age"+age+"score"+score+"gender"+gender;
        //System.out.println(info);
        String info2 = String.format("我的名字是%s 年龄是 %d 成绩是 %.2f 性别是 %c",name,age,score,gender);
        System.out.println(info2);

    }
}
