package com.lzc.houserent.service;

import com.lzc.houserent.domain.House;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class HouseService {
    private House[] house;//保存House对象\
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size) {
        house = new House[size];//当创建houseservice对象时，指定数组大小
        //为了配合测试列表信息，初始化一个house对象
        house[0] = new House(1, "jakk", "112", "江苏", 2000, "未出租");
    }

    public House[] list() {
        return house;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加(暂时不考虑数组扩容问题)
        if (houseNums >= house.length) {//不能再添加
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
        //把newHouse对象加入到数组最后
        house[houseNums++] = newHouse;
        //需要设计一个id自增长的机制,然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //del方法，删除一个房屋信息
    public boolean delete(int delId) {
        //首先找到删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == house[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        //如果找到，这里需要动脑筋，有点麻烦
        //思路:
        for (int i = index; i < houseNums - 1; i++) {
            house[i] = house[i + 1];
        }
        //把当前存在的房屋信息的最后一个 设置null
        house[--houseNums] = null;
        return true;
    }

    public House find(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == house[i].getId()) {
                return house[i];
            }
        }
        return null;
    }

    public boolean update(House newHouse, int updateId) {
        House house1 = find(updateId);
        if (house1 != null) {
            house1.setName(newHouse.getName());
            house1.setPhone(newHouse.getPhone());
            house1.setAddress(newHouse.getAddress());
            house1.setRent(newHouse.getRent());
            house1.setState(newHouse.getState());
            return true;
        }
        return false;
    }
}
