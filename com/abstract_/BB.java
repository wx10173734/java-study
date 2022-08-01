package com.abstract_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class BB extends Template {
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i <= 800000; i++) {
            num *= i;
        }
    }
}
