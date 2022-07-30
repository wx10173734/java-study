package com.lzc.extend_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小明";
        pupil.age=10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
    }
}
