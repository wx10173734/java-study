package com.interface_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
