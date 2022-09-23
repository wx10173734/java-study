package com.listandset.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @title: Map_
 * @Author luozouchen
 * @Date: 2022/9/18 20:55
 * @Version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        //map接口实现类的特点,使用实现类HashMap
        //1. Map 与 Collection 并列存在。用于保存具有映射关系的数据:Key-Value(双列元素)
        //2. Map 中的 key 和 value 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
        //3. Map 中的 key 不允许重复，原因和 HashSet 一样，前面分析过源码.
        // 4. Map 中的 value 可以重复
        //5. Map 的 key 可以为 null, value 也可以为 null ，注意 key 为 null,只能有一个，value 为 null ,可以多个
        //6. 常用 String 类作为 Map 的 key
        //7. key 和 value 之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value
        Map map = new HashMap<>();
        map.put("no1", "罗邹晨");//k-v
        map.put("no2", "张无忌");//k-v
        map.put("no1", "张三丰");//当有相同的k，就等价于替换
        map.put("no3", "张三丰");//value可重复
        map.put(null, null);
        map.put(null, "abc");//等价替换
        map.put("no4", null);//k-v
        map.put("no5", null);//k-v
        map.put(1, "赵敏");
        map.put(new Object(), "金毛狮王");
        //通过get方法传入一个key，会返回对应的value
        System.out.println(map.get(1));

    }
}
