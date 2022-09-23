package com.listandset.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }
}
