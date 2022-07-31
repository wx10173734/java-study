package com.oop.houserent;

import com.oop.houserent.view.HouseView;

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
