package com.interface_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class Interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);
    }
}
