package com.abstract_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
abstract class Template {
    public abstract void job();
    public void caleTimes(){
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间:" + (end - start));
    }
}
