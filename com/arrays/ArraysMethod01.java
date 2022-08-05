package com.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,20,90};
        System.out.println(Arrays.toString(integers));
        //演示sort方法的使用
        Integer arr[] = {1,-1,7,0,89};
        //因为数组是引用类型，所以通过sort排序后，会直接影响到实参arr
        //sort重载的，也可以通过传入一个接口 comparator 实现定制排序
        //定制排序，调用定制排序时，传入两个参数 1.排序数组 2.实现了comparator的匿名内部类 要求实现compare方法
        //这里体现了接口编程的方式 看看源码，就明白

        //默认排序
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2-i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
