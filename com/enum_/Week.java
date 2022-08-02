package com.enum_;

/**
 * @author luozouchen
 * @date 2022/8/2
 * @apiNote
 */
public enum Week {
    ;
    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
