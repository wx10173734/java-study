package com.listandset.list_;

import java.util.Vector;

/**
 * @author luozouchen
 * @date 2022/9/4
 * @apiNote
 */
public class Vertor_ {
    public static void main(String[] args) {
        //无参构造器
        //有参数的构造
        Vector<Object> objects = new Vector<>();
        for (int i = 0; i < 10; i++) {
            objects.add(i);
        }
        objects.add(100);
        //老韩解读
        //1.new Vector 底层
        /*
         public Vector() {
        this(10);
            }
         */
        //2.vector.add(i);
        //2.1下面这个方法就添加数据到vector
        /*
        public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[elementCount++] = e;
        return true;
    }
         */
        /*
        2.2调用ensureCapacityHelper方法
        确认是否需要扩容，条件 minCapacity - elementData.length > 0
         */
        /*
        2.3如果需要的数组大小不够用，就扩容，扩容的算法是 int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                         capacityIncrement : oldCapacity);
         int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                         capacityIncrement : oldCapacity);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
         */
    }
}
;