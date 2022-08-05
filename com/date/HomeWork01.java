package com.date;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class HomeWork01 {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse = null;
        try {
            reverse = reverse(str, 1, 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(reverse);
    }

    public static String reverse(String str, int start, int end) {
        //对输入的参数做一个验证
        //重要的编程技巧
        //1.写出正确的情况
        //取反
        if (!(str != null && start >= 0 && end > start && end < str.length() - 1)){
            throw new RuntimeException("参数不正确");
        }
            char[] chars = str.toCharArray();
        char temp = ' ';//交换辅助变量
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars重新构建一个String 即可
        return new String(chars);
    }
}
