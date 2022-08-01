package com.interface_;
/**
 * @author luozouchen
 * @date 2022/8/1
 * @apiNote
 */

/**
 * \
 * 演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();
        IH ih = new Teacher();
    }
}

interface IH {
    void hi();
}

interface IG extends IH{
}

class Teacher implements IG {
    @Override
    public void hi() {
    }
}
