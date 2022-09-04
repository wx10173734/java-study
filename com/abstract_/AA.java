package com.abstract_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class AA extends Template{
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 10000000; i++) {
            num += i;
        }
    }
}
    //冒泡排序

