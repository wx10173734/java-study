package com.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
