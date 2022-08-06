package com.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luozouchen
 * @date 2022/8/6
 * @apiNote
 */
public class ArrayListSource {
    public static void main(String[] args) {
        //老韩解读源码
        //注意，注意，注意，Idea    默认情况下，Debug    显示的数据是简化后的，如果希望看到完整的数据
        //需要做设置.
        //使用无参构造器创建  ArrayList  对象
        //ArrayList  list =  new ArrayList();
        ArrayList list = new ArrayList(8);
        //使用  for  给  list 集合添加    1-10 数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //使用  for  给  list 集合添加    11-15  数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
