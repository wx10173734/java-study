package com.oop.searchTest;

import java.util.Scanner;

/**
 * @author luozouchen
 * @date 2022/7/28
 * @apiNote
 */
public class SeqSearch {
    public static void main(String[] args) {
        String str[] = {"白眉", "金毛", "紫衫", "青"};
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < str.length; i++) {
            if (name.equals(str[i])){
                System.out.println("找到了,下标为"+i);
                break;
            }
        }
    }
}
