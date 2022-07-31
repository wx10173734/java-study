package com.lzc.houserent;

import com.lzc.houserent.view.HouseView;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class HouseRentApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("退出房屋系统");
    }
}
