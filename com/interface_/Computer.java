package com.interface_;

/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */
public class Computer {
    public void work(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }
}
