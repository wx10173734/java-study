package com.date;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class HomeWork04 {
    public static void main(String[] args) {
        String str = "123jda8q2u8AA";
        countStr(str);

    }
    public static void countStr(String str){
        if (str==null){
            System.out.println("null");
            return;
        }
        int length = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <='9'){
                numCount++;
            }else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerCount++;
            }else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                upperCount++;
            }
        }
        System.out.println(numCount);
        System.out.println(lowerCount);
        System.out.println(upperCount);
    }
}
