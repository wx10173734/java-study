package com.test10_exercise;

import java.sql.SQLOutput;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public class HomeWork08 {
    public static void main(String[] args) {
        Color[] values = Color.values();
        for (Color value : values) {
            System.out.println(value.name());
            switch (value.name()){
                case "RED":
                    System.out.println(value);
                    break;
                case "BLUE":
                    System.out.println(value);
                    break;
                case "BLACK":
                    System.out.println(value);
                    break;
                case "YELLOW":
                    System.out.println(value);
                    break;
                case "GREEN":
                    System.out.println(value);
                    break;

            }
        }

    }
}

enum Color implements showColor{
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public String show() {
        return "属性值"+redValue+","+greenValue+","+blueValue;
    }

    @Override
    public String toString() {
        return show();
    }
}

interface showColor {
    public String show();
}